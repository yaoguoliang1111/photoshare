package com.etc.dao.impl;

import com.etc.dao.PictureDao;
import com.etc.entity.Picture;
import com.etc.util.BaseDao;

public class PictureDaoImpl implements PictureDao{
	
	@Override
	public int insertPicture(Picture pic) {
		String sql1 = "INSERT INTO picture(`pId`, `pName`, `pDate`, `pUrl`) VALUES (?,?, NOW(), ?) ";
		return BaseDao.execute(sql1,pic.getpId(),pic.getpName(),pic.getpUrl());
	}

}
