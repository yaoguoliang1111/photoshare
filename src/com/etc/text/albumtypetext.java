package com.etc.text;

import java.util.List;

import com.etc.entity.AlbumType;
import com.etc.service.impl.AlbumServiceImpl;

public class albumtypetext {
	public static void main(String[] args) {
		AlbumServiceImpl al=new AlbumServiceImpl();
		List<AlbumType> list=al.doQueryAlbumType();
		System.out.println(list);
				
	}

}
