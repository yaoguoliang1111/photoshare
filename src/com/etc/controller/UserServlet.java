package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;
import com.etc.util.MD5Util;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// 获取请求编码
		request.setCharacterEncoding("utf-8");
		

		// 设置编码格式
		response.setContentType("text/html;charset=UTF-8");


		// 获取op
		String op = request.getParameter("op");
		
		PrintWriter out = response.getWriter();

		// 创建Service对象
		UserService us = new UserServiceImpl();

		if ("login".equals(op)) {

			

			// 获取登录表单的文本信息
			String uName = request.getParameter("username");
			String uPwd = request.getParameter("password");
			
			String remember = request.getParameter("remember");

			/*
			 * 校验验证码 1.从session中获取正取的验证码 2.从表单中获取用户填写的验证码 3.进行比较
			 * 4.如果相同，向下运行，否则保存错误信息到request域，转发到login.jsp
			 */
			String sessionCode = (String) request.getSession().getAttribute("session_code");// 获得的验证码里面对应的文本内容
			String paramCode = request.getParameter("verifyCode");// 用户输入文本框里面的内容
			
		
			// 调用Service里登录的方法
			User u = us.loginUser(uName, uPwd);
			
			if (u == null) {

				out.println("<script>alert('账号或密码错误，登录失败！');location.href='login.jsp'</script>");
				
			} else if (!paramCode.equalsIgnoreCase(sessionCode)) {
				/*
				 * request.setAttribute("msg", "验证码错误！");
				 * request.getRequestDispatcher("/login.jsp").forward(request, response);
				 */
				out.println("<script>alert('验证码错误，登录失败！');location.href='login.jsp'</script>");
				// 打回到登录界面。
				return;// 返回，不继续执行下面的语句。
			}else {
				
				if (remember != null) {
					Cookie c1 = new Cookie("username", uName);
					Cookie c2 = new Cookie("password", uPwd);
					c1.setMaxAge(1000);
					c2.setMaxAge(1000);//这里设置保存这条Cookie的时间
					response.addCookie(c1);//添加Cookie
					response.addCookie(c2);
					
					// 登录成功后将用户信息存入session
					request.getSession().setAttribute("user", u);
					
					out.println("<script>alert('登录成功,已记住用户名');location.href='index.jsp'</script></script>");
				} else {
					
					// 登录成功后将用户信息存入session
					request.getSession().setAttribute("user", u);
					
					out.println("<script>alert('登录成功,没有记住用户名');location.href='index.jsp'</script>");
				}
				
				/*request.getSession().setAttribute("user", u);

				out.print("<script>alert('登录成功');location.href='index.jsp'</script>");*/
			}
			
			
			

		}
		// 退出登录时，session消失
		else if ("outlogin".equals(op)) {
		
			HttpSession session=request.getSession(false);
			session.removeAttribute("user");
			response.sendRedirect("index.jsp");
		}
		
		else if("reg".equals(op)) {
			
			// 获去请求参数
			String uName = request.getParameter("username");
			String uPwd = request.getParameter("re-password");
			String uTel = request.getParameter("tel");
			String uSex = request.getParameter("sex");
			
			System.out.println("uSex:"+uSex);
			
			// 密码加密
			uPwd = MD5Util.getEncodeByMd5(uPwd);
			
			User user = new User(uName, uPwd, uSex, uTel);
			
			boolean flag = us.regUser(user);
			
			if(flag) {
				
				out.print("<script>alert('注册成功，去登录');location.href='login.jsp'</script>");
				
			}else {
				
				out.print("<script>alert('注册失败');location.href='reg.jsp'</script>");
			}
			
		}
		else if ("updatePwd".equals(op)) {
			
			// 获取要修改的密码
			String confirmpwd = request.getParameter("confirmpwd");
			String uPwd = MD5Util.getEncodeByMd5(confirmpwd);
			
			// 找到保存到session中的登录用户
			User user = (User) request.getSession().getAttribute("user");
			
			String uName = user.getuName();
			
			// 调用Service里修改密码的方法
			boolean flag = us.updatePwd(uPwd, uName);
			
			if(flag) {
				
				out.print("<script>alert('密码修改成功，去登录');location.href='login.jsp'</script>");
			}else {
				
				out.print("<script>alert('密码修改失败');location.href='updatePwd.jsp'</script>");
			}
			
		}else if("updateUserInfo".equals(op)) {
			
			// 获取请求参数
			String uName = request.getParameter("uName");
			String uTel = request.getParameter("tel");
			String uSex = request.getParameter("sex");
			
			// 找到保存到session中的登录用户
			User user = (User) request.getSession().getAttribute("user");
			int uId = user.getuId();
			
			User u = new User(uId, uName, uSex, uTel);
			
			boolean flag = us.updateUser(u);
			
			if (flag) {
				
				out.print("<script>alert('用户个人信息修改成功,去重新登录后刷新');location.href='login.jsp'</script>");
				
			}else {
				
				out.print("<script>alert('用户信息修改失败!');location.href='userInfo.jsp'</script>");
			}
			
			
		}
	 
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
