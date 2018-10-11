package com.etc.dao;

import com.etc.entity.User;

/**
 * 自定义Dao接口
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * 查找用户名、密码进行登录
	 * @param uName用户名
	 * @param uPwd密码
	 * @return
	 */
	User findUser(String uName,String uPwd);
}
