package com.etc.dao.impl;
import java.util.ArrayList;
import com.etc.dao.AlbumDao;
import com.etc.entity.AlbumSelectBean;
import com.etc.util.BaseDao;
import com.etc.util.PageData;


/**
 * Dao接口的实现类
 * @author Administrator
 *
 */
public class AlbumDaoImpl implements AlbumDao {
/**
 * 获取首页相册
 */
	@Override
	public PageData<AlbumSelectBean> queryAlbum(int page, int pageSize) {
		// TODO Auto-generated method stub
		String sql="SELECT album.aTitle,album.aDescription,album.createTime,album.coverPictureURL,album.aLikes,count(comment.cId) as co from album left join comment on album.aId=comment.aId GROUP BY comment.aId";
		PageData<AlbumSelectBean> list=BaseDao.getPage(sql, page, pageSize, AlbumSelectBean.class);
		return list;
	}
}
