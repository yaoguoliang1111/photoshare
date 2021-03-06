package com.etc.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc.dao.AlbumDao;
import com.etc.entity.Album;
import com.etc.entity.AlbumComment;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.util.BaseDao;
import com.etc.util.PageData;
import com.etc.util.UUIDUtils;

/**
 * Dao接口的实现类
 * 
 * @author Administrator
 *
 */
public class AlbumDaoImpl implements AlbumDao {
	/**
	 * 获取首页相册
	 */
	@Override
	public PageData<AlbumSelectBean> queryAlbum(int page, int pageSize) {
		// TODO Auto-generated method stub
		String sql = "SELECT album.aId,album.aTitle,album.aDescription,album.createTime,picture.pUrl,album.aLikes,count(COMMENT.cId) AS co FROM album LEFT JOIN COMMENT ON album.aId=COMMENT.aId LEFT JOIN picture ON picture.pId=album.coverPId WHERE album.aState=1 GROUP BY COMMENT.aId";
		PageData<AlbumSelectBean> list = BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class);
		return list;
	}


	@Override
	public List<Album> getAlbum(String aId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM album_picture_relationship inner join album on album_picture_relationship.aId=album.aId INNER JOIN picture ON album_picture_relationship.pId=picture.pId where album_picture_relationship.aId=?";
		List<Album> list= (List<Album>)BaseDao.select(sql, Album.class, aId);
		return list; 
	}

	/**
	 * 获取模糊查询的相册
	 */
	@Override
		public PageData<AlbumSelectBean> queryAlbumlike(int page, int pageSize, String like) {
			// TODO Auto-generated method stub
		String sql="SELECT album.aId ,album.aTitle ,album.aDescription ,album.createTime ,picture.pUrl ,album.aLikes ,count(comment.cId) as co from album left join comment on album.aId=comment.aId LEFT JOIN picture ON picture.pId=album.coverPId WHERE album.aState=1 and album.aTitle like ? GROUP BY comment.aId";
		PageData<AlbumSelectBean> list=BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class, "%"+like+"%");
			return list;
		}
	/**
	 * 获取相册的类型
	 */
	@Override
		public List<AlbumType> queryAlbumType() {
			// TODO Auto-generated method stub
		String sql="SELECT * FROM albumtype";
		List<AlbumType> list=(List<AlbumType>)BaseDao.select(sql, AlbumType.class);
			return list;
		}
	/**
	 * 通过相册类型获取相册
	 */
	@Override
		public PageData<AlbumSelectBean> qAlbumType(int page, int pageSize,int tId) {
			// TODO Auto-generated method stub
		String sql="SELECT album.aId ,album.aTitle ,album.aDescription ,album.createTime ,picture.pUrl ,album.aLikes ,count(comment.cId) as co from album left join comment on album.aId=comment.aId LEFT JOIN picture ON picture.pId=album.coverPId WHERE album.aState=1 and album.tId=? GROUP BY comment.aId";
		PageData<AlbumSelectBean> list=BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class, tId);
			return list;
		}
	
	/**
	 * 添加相册 （事务）
	 */
	@Override
	public boolean addAlbum(Album album,String allpid) {
		Connection conn = BaseDao.getConn();

		try {
			conn.setAutoCommit(false);
			String [] allpid2=allpid.split(",");
			String sql1 = "INSERT INTO album  VALUES (?,?,?,?, NOW(),?,0,?,?) ";
			String aId=UUIDUtils.getUUID();
			BaseDao.execute(sql1,conn,aId,album.getaTitle(),album.getaDescription(),album.gettId(),allpid2[0],album.getuId()
			,album.getaState());
			//记得要传递第二个参数Connection对象
			for(int i=0;i<allpid2.length;i++) {
			String sql2 = "INSERT INTO album_picture_relationship VALUES (?,?) ";
			BaseDao.execute(sql2,conn,allpid2[i],aId);
			}

			//手动提交
			conn.commit();
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			// 3 回滚
			try {
				conn.rollback();
				System.out.println("失败~事务自动回滚~");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();
			return false;

	}
	}
	/**
	 * 获取点赞前四名的相册
	 */
	@Override
	public List<AlbumSelectBean> queryLike() {
		// TODO Auto-generated method stub
		String sql="SELECT album.aId,album.aTitle,album.aDescription,album.createTime,picture.pUrl,album.aLikes FROM album LEFT JOIN picture ON picture.pId=album.coverPId WHERE album.aState=1 ORDER BY album.aLikes DESC LIMIT 4";
		List<AlbumSelectBean> list=(List<AlbumSelectBean>)BaseDao.select(sql, AlbumSelectBean.class);
		return list;
	}

	/**
	 * 获取相册评论
	 */
	@Override
	public List<AlbumComment> queryAlbumComment(String aId) {
		// TODO Auto-generated method stub
		String sql="SELECT comment.cId ,comment.cContent, user.uName ,comment.cDate FROM comment INNER JOIN user ON `comment`.uId=`user`.uId INNER JOIN album on `comment`.aId=album.aId where `comment`.aId=?";
		List<AlbumComment> list=(List<AlbumComment>)BaseDao.select(sql, AlbumComment.class, aId);
		return list;
	}

	/**
	 * 
	 */
	@Override
	public boolean addComment(String aId, String Comment, int uId) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO `comment`(cContent,uId,aId,cDate) VALUES(?,?,?,NOW()) ";
		return BaseDao.execute(sql, uId,aId,Comment)>1;
	}

}
