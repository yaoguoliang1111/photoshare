package com.etc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.dao.impl.AlbumDaoImpl;
import com.etc.entity.Album;
import com.etc.entity.AlbumComment;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.service.AlbumService;
import com.etc.util.PageData;
;

/**
 * Service接口实现类
 * @author Administrator
 *
 */
public class AlbumServiceImpl implements AlbumService {

	AlbumDaoImpl ad=new AlbumDaoImpl();
	/**
	 * 获取首页相册页面
	 */
	@Override
	public PageData<AlbumSelectBean> doQueryAlbum(int page, int pageSize) {
		// TODO Auto-generated method stub
		return ad.queryAlbum(page, pageSize);
	}


	/**
	 * 获取模糊查询的相册
	 */

	
	@Override
	public PageData<AlbumSelectBean> doQueryAlbumLike(int page, int pageSize, String like) {
		// TODO Auto-generated method stub
		return ad.queryAlbumlike(page, pageSize, like);
	}
	@Override
	public List<AlbumType> doQueryAlbumType() {
		// TODO Auto-generated method stub
		return ad.queryAlbumType();
	}
	/**
	 * 通过类型获取相册
	 */
	@Override
	public PageData<AlbumSelectBean> doQAlbumType(int page, int pageSize, int tId) {
		// TODO Auto-generated method stub
		return ad.qAlbumType(page, pageSize, tId);
	}
	
	@Override
	public boolean addAlbum(Album album, String allpid) {
		// TODO 自动生成的方法存根
		return ad.addAlbum(album, allpid);
	}
	/**
	 * 获取点赞排行前四名的相册
	 */
	@Override
	public List<AlbumSelectBean> doQueryLike() {
		// TODO Auto-generated method stub
		
		return ad.queryLike();
	}

	
	@Override
	public List<Album> getAlbum(String aId) {
		// TODO Auto-generated method stub
		return ad.getAlbum(aId);
	}


	@Override
	public List<AlbumComment> getAlbumComment(String aId) {
		// TODO Auto-generated method stub
		return ad.queryAlbumComment(aId);
	}


	@Override
	public boolean addComment(String aId, String Comment, int uId) {
		// TODO Auto-generated method stub
		return ad.addComment(aId,Comment,uId);
	}
	
}
