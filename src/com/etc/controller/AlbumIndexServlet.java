package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.Album;
import com.etc.entity.AlbumComment;
import com.etc.service.AlbumService;
import com.etc.service.impl.AlbumServiceImpl;

/**
 * Servlet implementation class AlbumIndexServlet
 */
@WebServlet("/ai.do")
public class AlbumIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AlbumService as=new AlbumServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlbumIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		//创建out对象
		PrintWriter out=response.getWriter();
		 //设置请求编码
		request.setCharacterEncoding("utf-8");
		String op=request.getParameter("op");
		
		//从相册展示页面中获取相册id
		
		
		if("albumIndex".equals(op)) {
			//获取相册照片详情
			String aId = request.getParameter("aId");
			List<Album> list=as.getAlbum(aId);
			request.setAttribute("list", list);
			//获取相册评论详情
			List<AlbumComment> listc=as.getAlbumComment(aId);
			request.setAttribute("listc", listc);
			request.setAttribute("aId", aId);
			request.getRequestDispatcher("album.jsp").forward(request, response);
		}
		
		if("addComment".equals(op)) {
			String aId=request.getParameter("aId");
			String Comment=request.getParameter("text");
			//int uId=request.getParameter("uId");
			//boolean flag=as.addComment(aId, Comment, uId);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
