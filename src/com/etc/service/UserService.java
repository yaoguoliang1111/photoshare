package com.etc.service;

import com.etc.entity.User;

/**
 * 自定义Service接口
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 用户登录
	 * @param uName用户名
	 * @param uPwd密码
	 * @return
	 */
	User loginUser(String uName , String uPwd);
	
	/**
	 * 注册时验证用户名
	 * @param uName
	 * @return
	 */
	User regCheckName(String uName);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	boolean regUser(User user);
	
	/**
	 * 根据用户名修改密码
	 * @param uPwd
	 * @param uName
	 * @return
	 */
	boolean updatePwd(String uPwd,String uName);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
}
