package com.etc.dao.impl;
import java.util.ArrayList;
import java.util.List;

import com.etc.dao.AlbumDao;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.util.BaseDao;
import com.etc.util.PageData;


/**
 * Dao接口的实现类
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
		String sql="SELECT album.aId ,album.aTitle ,album.aDescription ,album.createTime ,album.coverPictureURL ,album.aLikes ,count(comment.cId) as co from album left join comment on album.aId=comment.aId WHERE album.aState=1 GROUP BY comment.aId";
		PageData<AlbumSelectBean> list=BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class);
		return list;
	}
	/**
	 * 获取模糊查询的相册
	 */
	@Override
		public PageData<AlbumSelectBean> queryAlbumlike(int page, int pageSize, String like) {
			// TODO Auto-generated method stub
		String sql="SELECT album.aId ,album.aTitle ,album.aDescription ,album.createTime ,album.coverPictureURL ,album.aLikes ,count(comment.cId) as co from album left join comment on album.aId=comment.aId WHERE album.aState=1 and album.aTitle like ? GROUP BY comment.aId";
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
}
