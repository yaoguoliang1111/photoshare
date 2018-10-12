package com.etc.service;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> branch 'master' of https://github.com/yaoguoliang1111/photoshare.git

<<<<<<< HEAD
import com.etc.entity.Album;
=======
import java.util.List;
>>>>>>> branch 'master' of https://github.com/yaoguoliang1111/photoshare.git
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
<<<<<<< HEAD
	
	List<Album> getAlbum(int aId);
=======
	PageData<AlbumSelectBean> doQueryAlbumLike(int page,int pageSize,String like);
	List<AlbumType> doQueryAlbumType();
>>>>>>> branch 'master' of https://github.com/yaoguoliang1111/photoshare.git
}
