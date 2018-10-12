package com.etc.dao.impl;

import com.etc.dao.PictureDao;
import com.etc.entity.Picture;
import com.etc.util.BaseDao;

public class PictureDaoImpl implements PictureDao{
	
	@Override
	public int insertPicture(Picture pic) {
		
		String sql="INSERT INTO picture( `pName`, `pDate`, `pUrl`) VALUES (?, NOW(), ?) ";	
		
		return BaseDao.execute(sql,pic.getpName(),pic.getpUrl());
		
		
	}

}
