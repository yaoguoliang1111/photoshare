package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/us.do")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 获取请求编码
		request.setCharacterEncoding("utf-8");
		
		// 获取op
		String op = request.getParameter("op");
		
		// 创建Service对象
		UserService us = new UserServiceImpl();
		
		if("login".equals(op)) {
			
			//设置编码格式
			response.setContentType("text/html;charset=UTF-8");
			
		    PrintWriter out = response.getWriter();
		    
			// 获取登录表单的信息
			String uName = request.getParameter("username");
			String uPwd = request.getParameter("password");
			
			// 调用Service里登录的方法
			User u = us.loginUser(uName, uPwd);
			
			if(u==null) {
				
				out.println("<script>alert('登录失败');location.href='login.jsp'</script>");
			}else {
				
				out.print("<script>alert('登录成功');location.href='index.html'</script>");
			}
			
			
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
