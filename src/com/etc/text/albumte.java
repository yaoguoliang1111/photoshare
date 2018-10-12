package com.etc.text;

import java.util.ArrayList;
import java.util.List;

import com.etc.entity.AlbumSelectBean;
import com.etc.service.impl.AlbumServiceImpl;
import com.etc.util.PageData;

public class albumte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlbumServiceImpl al=new AlbumServiceImpl();
		int page=1;
		int pageSize=4;
		PageData<AlbumSelectBean> pa=al.doQueryAlbum(page, pageSize);
		List<AlbumSelectBean> pag=pa.getData();
		List<AlbumSelectBean> lista=new ArrayList<>();
		List<AlbumSelectBean> listb=new ArrayList<>();
		for (int i = 0; i < pag.size(); i++) {
			if(i<4) {
				lista.add(pag.get(i));
			}else {
				listb.add(pag.get(i));
			}
		}
		System.out.println(lista);
		System.out.println(listb);

	}

}
