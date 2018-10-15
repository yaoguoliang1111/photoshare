package com.etc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.dao.UserDao;
import com.etc.dao.impl.UserDaoImpl;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;

/**
 * Servlet implementation class RigisterServlet
 */
@WebServlet("/regs.do")
public class RigisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService us = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RigisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//获取请求编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// out打印
		PrintWriter out =response.getWriter();
		
		// 获取op
		String op = request.getParameter("op");
		
		if("username".equals(op)) {
			
		// 获取用户名请求参数
		String uName = request.getParameter("username");
		
		String data = null;
		
		// 查找数据库里的用户名
		User u = us.regCheckName(uName);
		
		if(u == null){
			
		
			data = " ";
		}else {
			
			data = "此昵称已存在，请重新填写昵称";
			
		}
		
		// 将data数据打印给界面
	    out.println(data);
	    
	    out.close();
	    
		}else if("password".equals(op)) {
			
			// 获取密码请求参数
			String uPwd = request.getParameter("password");
			
			String data = null;
			
			// 密码判断
			/*String reg = "^[a-zA-Z0-9]{6,12}$";
			Pattern p=Pattern.compile(reg);
		    Matcher matcher=p.matcher(uPwd);
		    
		    if(!matcher.find()) {
		    	
		    	data = "";
		    	
		    }
		    else {
		    	
		    	data = " ";
		    }*/
			
			boolean flag = isLetterDigit(uPwd);
			
			if(flag == false) {
				
				data = "密码要求字母数字组合且在6-12位";
				
			}else {
				
				data = " ";
			}
				
			// 将data数据打印给界面
			out.print(data);
			
			out.close();
			
		}else if("re-password".equals(op)) {
			
			// 获取密码
			String uPwd = request.getParameter("password");
			String rePwd = request.getParameter("re-password");
			
			String data = null;
			
			if(rePwd.equals(uPwd)) {
				
				data = " ";
				
			}else {
				
				data = "两次输入的密码不一致";
			}
			
			// 将data数据打印给界面
			out.println(data);
			
			out.close();			
			
		}else if("tel".equals(op)) {
			
			// 获取手机号码
			String tel = request.getParameter("tel");
			
			String data = null;
			
			// 手机号格式判断
			String reg = "[1][3578]\\d{9}";//"[1]"代表第1位为数字1，"[3578]"代表第二位可以为3、5、7、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
			Pattern p = Pattern.compile(reg);
			Matcher matcher = p.matcher(tel);
			
			if(matcher.find()) {
				
				data=" ";
			}else {
				
				data="请输入正确的手机号码";
			}
		
			// 将data数据打印给界面
			out.println(data);
			
			out.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * 密码判断（包含大小写字母及数字且在6-12位）
	 * @param str
	 * @return
	 */
	public static boolean isLetterDigit(String str) {
	    boolean isDigit = false;//定义一个boolean值，用来表示是否包含数字
	    boolean isLetter = false;//定义一个boolean值，用来表示是否包含字母
	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isDigit(str.charAt(i))) {   //用char包装类中的判断数字的方法判断每一个字符
	            isDigit = true;
	        } else if (Character.isLetter(str.charAt(i))) {  //用char包装类中的判断字母的方法判断每一个字符
	            isLetter = true;
	        }
	    }
	    String regex = "^[a-zA-Z0-9]{6,12}$";
	    boolean isRight = isDigit && isLetter && str.matches(regex);
	    return isRight;
	}
	
	
	
	

}
