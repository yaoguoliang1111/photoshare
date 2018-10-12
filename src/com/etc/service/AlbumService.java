package com.etc.service;

import java.util.ArrayList;

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
	PageData<AlbumSelectBean> doQueryAlbumLike(int page,int pageSize,String like);
}
