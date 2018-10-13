package com.etc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.etc.dao.impl.AlbumDaoImpl;
import com.etc.entity.Album;
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

	@Override
	public List<Album> getAlbum(int aId) {
		// TODO Auto-generated method stub
		return ad.getAlbum(aId);
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
	
}
