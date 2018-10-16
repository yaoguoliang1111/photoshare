package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.dao.impl.UserDaoImpl;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.util.MD5Util;

/**
 * Service接口实现类
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {

	private UserDao ud = new UserDaoImpl();
	
	@Override
	public User loginUser(String uName, String uPwd) {
		// TODO Auto-generated method stub
		
		uPwd = MD5Util.getEncodeByMd5(uPwd);
		return ud.findUser(uName, uPwd);
		
	}
	
	@Override
	public User regCheckName(String uName) {
		// TODO Auto-generated method stub
		return ud.findName(uName);
	}
	
	@Override
	public boolean regUser(User user) {
		// TODO Auto-generated method stub
		return ud.addUser(user);
	}
	
	@Override
	public boolean updatePwd(String uPwd, String uName) {
		// TODO Auto-generated method stub
		return ud.upPwd(uPwd, uName);
	}
	
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return ud.upUser(user);
	}
}
