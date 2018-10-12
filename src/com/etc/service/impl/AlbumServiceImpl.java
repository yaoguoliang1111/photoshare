package com.etc.service.impl;

import java.util.ArrayList;
import com.etc.dao.impl.AlbumDaoImpl;
import com.etc.entity.AlbumSelectBean;
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
	
	
}
