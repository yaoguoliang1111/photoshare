package com.etc.service.impl;

import com.etc.dao.PictureDao;
import com.etc.dao.impl.PictureDaoImpl;
import com.etc.entity.Picture;
import com.etc.service.PictureService;


public class PictureServiceImpl implements PictureService{
	
	private PictureDao pd =new PictureDaoImpl();

	@Override
	public int addPicture(Picture pic) {
		return pd.insertPicture(pic);
	}

}
