package com.etc.text;

import java.util.ArrayList;

import com.etc.entity.AlbumSelectBean;
import com.etc.service.impl.AlbumServiceImpl;
import com.etc.util.PageData;

public class albumte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlbumServiceImpl al=new AlbumServiceImpl();
		int page=1;
		int pageSize=3;
		PageData<AlbumSelectBean> pa=al.doQueryAlbum(page, pageSize);
		System.out.println(pa.getData());

	}

}
