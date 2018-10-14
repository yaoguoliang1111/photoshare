package com.etc.service;

import java.util.List;
import com.etc.entity.Album;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.util.PageData;

/**
 * 自定义Service接口
 * @author Administrator
 *
 */
public interface AlbumService {
/**
 * 获取首页相册
 * @return
 */
	PageData<AlbumSelectBean> doQueryAlbum(int page, int pageSize);

	
	List<Album> getAlbum(int aId);

	PageData<AlbumSelectBean> doQueryAlbumLike(int page,int pageSize,String like);
	List<AlbumType> doQueryAlbumType();
	PageData<AlbumSelectBean> doQAlbumType(int page, int pageSize,int tId);
	boolean addAlbum(Album album,String allpid);

}
