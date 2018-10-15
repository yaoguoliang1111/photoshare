package com.etc.service;

import java.util.List;
import com.etc.entity.Album;
import com.etc.entity.AlbumComment;
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

	//获取相册详情
	List<Album> getAlbum(String aId);
	//获取相册评论
	List<AlbumComment> getAlbumComment(String aId);
	//添加相册评论
	boolean addComment(String aId,String Comment,int uId);
	
	
	PageData<AlbumSelectBean> doQueryAlbumLike(int page,int pageSize,String like);
	List<AlbumType> doQueryAlbumType();
	PageData<AlbumSelectBean> doQAlbumType(int page, int pageSize,int tId);
	boolean addAlbum(Album album,String allpid);
	//获取点赞前四名的相册
	List<AlbumSelectBean> doQueryLike();


	
}
