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
}
