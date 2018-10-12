package com.etc.dao;

import java.util.ArrayList;



import com.etc.entity.AlbumSelectBean;
import com.etc.util.PageData;


/**
 * 自定义Dao接口
 * @author Administrator
 *
 */
public interface AlbumDao {

	PageData<AlbumSelectBean> queryAlbum( int page, int pageSize );
	PageData<AlbumSelectBean> queryAlbumlike( int page,int pageSize,String like);
	
	
}
