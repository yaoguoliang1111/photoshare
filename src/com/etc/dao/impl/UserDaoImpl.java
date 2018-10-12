package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.util.BaseDao;

/**
 * Dao接口的实现类
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User findUser(String uName, String uPwd) {
		// TODO Auto-generated method stub
		
		
		String sql = "SELECT * FROM  user where uName=? and uPwd=?";
		
		List<User> list = (List<User>)BaseDao.select(sql, User.class, uName,uPwd);
		
		if(list.size()>0) {
			
			return list.get(0);
		}else {
			return null;
		}
	}
}
