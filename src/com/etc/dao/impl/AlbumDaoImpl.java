package com.etc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.dao.AlbumDao;
import com.etc.entity.Album;
import com.etc.entity.AlbumSelectBean;
import com.etc.util.BaseDao;
import com.etc.util.PageData;

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
		String sql = "SELECT album.aId ,album.aTitle ,album.aDescription ,album.createTime ,album.coverPictureURL ,album.aLikes ,count(comment.cId) as co from album left join comment on album.aId=comment.aId WHERE album.aState=1 GROUP BY comment.aId";
		PageData<AlbumSelectBean> list = BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class);
		return list;
	}

	@Override
	public List<Album> getAlbum(int aId) {
		// TODO Auto-generated method stub
		String sql = "SELECT picture.pUrl FROM album_picture_relationship inner join album on album_picture_relationship.aId=album.aId INNER JOIN picture ON album_picture_relationship.pId=picture.pId where album_picture_relationship.aId=?";
		List<Album> list= (List<Album>)BaseDao.select(sql, Album.class, aId);
		return list; 
	}
}
