package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etc.entity.User;
import com.etc.util.MD5Util;

/**
 * Servlet implementation class UpdatePwdServlet
 */
@WebServlet("/updatePwd.do")
public class UpdatePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdatePwdServlet() {
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
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		String op = request.getParameter("op");

		// 找到保存到session中的登录用户
		User user = (User) request.getSession().getAttribute("user");

		if ("oldpwd".equals(op)) {

			// 获取请求参数
			String oldpwd = request.getParameter("oldpwd");

			String confirmpwd = request.getParameter("confirmpwd");

			// 得到当前用户的pwd
			String pwd = user.getuPwd();
			//System.out.println("原密码:" + pwd);

			oldpwd = MD5Util.getEncodeByMd5(oldpwd);
			//System.out.println("输入的密码:" + oldpwd);

			String data = null;
			if (oldpwd.equals(pwd)) {

				data = " ";
			} else {

				data = "原密码输入错误!";
			}

			// 将data数据传给界面
			out.print(data);

			out.close();

		} else if ("newpwd".equals(op)) {

			// 获取新密码框参数
			String newpwd = request.getParameter("newpwd");

			String data = null;

			boolean flag = isLetterDigit(newpwd);

			if (flag == false) {

				data = "密码要求字母数字组合且在6-12位";

			} else {

				data = " ";
			}

			// 将data数据打印给界面
			out.print(data);

			out.close();

		}else if("comfirmpwd".equals(op)) {
			
			// 获取请求参数
			String newpwd = request.getParameter("newpwd");
			String confirmpwd = request.getParameter("confirmpwd");
			
			String data = null;
			
			if(confirmpwd.equals(newpwd)) {
				
				data = " ";
				
			}else {
				
				data = "两次密码输入不一致!";
			}
			
			// 将data数据传给界面
			out.print(data);
			out.close();
			
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

	/**
	 * 密码判断（包含大小写字母及数字且在6-12位）
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isLetterDigit(String str) {
		boolean isDigit = false;// 定义一个boolean值，用来表示是否包含数字
		boolean isLetter = false;// 定义一个boolean值，用来表示是否包含字母
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) { // 用char包装类中的判断数字的方法判断每一个字符
				isDigit = true;
			} else if (Character.isLetter(str.charAt(i))) { // 用char包装类中的判断字母的方法判断每一个字符
				isLetter = true;
			}
		}
		String regex = "^[a-zA-Z0-9]{6,12}$";
		boolean isRight = isDigit && isLetter && str.matches(regex);
		return isRight;
	}

}
