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
	
	@Override
	public User findName(String uName) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT uName FROM  user where uName=?";
		
		List<User> list =(List<User>)BaseDao.select(sql, User.class, uName);
		
		if(list.size()>0) {
			
			return list.get(0);
		}else {
			
			return null;
		}
	}
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
	
		String sql = "INSERT INTO user (uName,uPwd,uSex,uTel) VALUES (?,?,?,?)";
	    int row = BaseDao.execute(sql, user.getuName(),user.getuPwd(),user.getuSex(),user.getuTel());
	    return row > 0;
	}
	
	@Override
	public boolean upPwd(String uPwd, String uName) {
		// TODO Auto-generated method stub
		String sql = "UPDATE user SET uPwd = ? WHERE uName = ?";
		
		return  BaseDao.execute(sql, uPwd,uName) > 0;
	}
	
	@Override
	public boolean upUser(User user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE user SET uName = ?,uSex=?,uTel=? WHERE uId = ?";
		return BaseDao.execute(sql, user.getuName(),user.getuSex(),user.getuTel(),user.getuId()) > 0;
	}
}
