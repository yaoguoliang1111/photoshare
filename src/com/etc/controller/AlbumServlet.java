package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.Album;
import com.etc.entity.AlbumSelectBean;
import com.etc.entity.AlbumType;
import com.etc.service.impl.AlbumServiceImpl;
import com.etc.util.PageData;
import com.google.gson.Gson;


/**
 * Servlet implementation class AlbumServlet
 */
@WebServlet("/Album.do")
public class AlbumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AlbumServiceImpl al=new AlbumServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlbumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置响应编码
				response.setContentType("text/html; charset=UTF-8");
				//创建out对象
				 PrintWriter out=response.getWriter();
				 //设置请求编码
				request.setCharacterEncoding("utf-8");
				String op=request.getParameter("op");
				if("photopage".equals(op)) {
					System.out.println("111");
					int page=1;
					int pageSize=8;
					//String userNameLike = "";
					if(request.getParameter("page")!=null) {
						page=Integer.valueOf(request.getParameter("page"));
						
					}
					if(request.getParameter("pageSize")!=null) {
						pageSize=Integer.valueOf(request.getParameter("pageSize"));
						
					}
					// 获取页面传递过来的userNameLike (模糊查询)参数
					//if (null != request.getParameter("selectlike")) {
						//userNameLike = request.getParameter("selectlike");
					//}

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
					
					
					request.setAttribute("pa", pa);
					request.setAttribute("lista", lista);
					request.setAttribute("listb", listb);
					//将模糊出查询的字符串 也转发回来
					

					request.getRequestDispatcher("index.jsp").forward(request, response);//页面跳转
				}
				else if("like".equals(op)) {
					int page=1;
					int pageSize=8;
					String userNameLike = "";
					if(request.getParameter("page")!=null) {
						page=Integer.valueOf(request.getParameter("page"));
						
					}
					if(request.getParameter("pageSize")!=null) {
						pageSize=Integer.valueOf(request.getParameter("pageSize"));
						
					}
					// 获取页面传递过来的userNameLike (模糊查询)参数
					if (null != request.getParameter("photolike")) {
						userNameLike = request.getParameter("photolike");
					}

					PageData<AlbumSelectBean> pa=al.doQueryAlbumLike(page, pageSize, userNameLike);
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
					
					
					request.setAttribute("pa", pa);
					request.setAttribute("lista", lista);
					request.setAttribute("listb", listb);
					//将模糊出查询的字符串 也转发回来
					//将模糊出查询的字符串 也转发回来
					request.setAttribute("likew", userNameLike);

					request.getRequestDispatcher("searchResult.jsp").forward(request, response);//页面跳转
				
				}
				else if("load".equals(op)) {
					
					List<AlbumType> aa=al.doQueryAlbumType();
					Gson sGson=new Gson();
					
					String albumtype=sGson.toJson(aa);
					
					response.getWriter().print(albumtype);
					
				}
				else if("altype".equals(op)) {
					System.out.println("111");
					int page=1;
					int pageSize=8;
					int tId=Integer.valueOf(request.getParameter("tId"));
					//String userNameLike = "";
					if(request.getParameter("page")!=null) {
						page=Integer.valueOf(request.getParameter("page"));
						
					}
					if(request.getParameter("pageSize")!=null) {
						pageSize=Integer.valueOf(request.getParameter("pageSize"));
						
					}
					// 获取页面传递过来的userNameLike (模糊查询)参数
					//if (null != request.getParameter("selectlike")) {
						//userNameLike = request.getParameter("selectlike");
					//}

					PageData<AlbumSelectBean> pa=al.doQAlbumType(page, pageSize, tId);
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
					request.setAttribute("pa", pa);
					request.setAttribute("lista", lista);
					request.setAttribute("listb", listb);
					//将模糊出查询的字符串 也转发回来
					request.getRequestDispatcher("showType.jsp").forward(request, response);//页面跳转
				}
				else if("addAlbum".equals(op)) {
				String aTitle=request.getParameter("aTitle");
				String aType=request.getParameter("aType");
				String aDescription=request.getParameter("aDetail");
				String allpid=request.getParameter("allpid");			
				Album album =new Album(aTitle, aDescription,Integer.parseInt(aType), 1, 1);
				al.addAlbum(album, allpid);
				System.out.println("添加成功");
				}
				else if("likeGruop".equals(op)) {
					//获取点赞前四名的相册
					List<AlbumSelectBean> likeList=al.doQueryLike();
					request.setAttribute("likeList",likeList);
					request.getRequestDispatcher("index.jsp").forward(request, response);//页面跳转
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
