package com.etc.dao;


import java.util.List;
import com.etc.entity.Album;
import com.etc.entity.AlbumComment;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.util.PageData;


/**
 * 自定义Dao接口
 * @author Administrator
 *
 */
public interface AlbumDao {

	PageData<AlbumSelectBean> queryAlbum( int page, int pageSize );
	PageData<AlbumSelectBean> queryAlbumlike( int page,int pageSize,String like);
	List<AlbumType> queryAlbumType();
	PageData<AlbumSelectBean> qAlbumType(int page, int pageSize,int tId);
	
	boolean addAlbum(Album album,String allpid);
	//获取点赞排名前四的相册
	List<AlbumSelectBean> queryLike();
	
	//获取相册详情
	List<Album> getAlbum(String aId);
	//获取相册评论
	List<AlbumComment> queryAlbumComment(String aId);
	//添加相册评论
	boolean addComment(String aId, String Comment, int uId);
}
