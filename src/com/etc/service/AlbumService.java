package com.etc.service;

import java.util.ArrayList;
import java.util.List;

import com.etc.entity.Album;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.User;
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
}
