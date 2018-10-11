package com.etc.entity;
/**
 * 自定义实体类
 * @author Administrator
 *
 */
public class User {
	
	private int uId;
	private String uName;
	private String uPwd;
	private String uSex;
	private String uTel;
	private int uState;
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	public String getuTel() {
		return uTel;
	}
	public void setuTel(String uTel) {
		this.uTel = uTel;
	}
	public int getuState() {
		return uState;
	}
	public void setuState(int uState) {
		this.uState = uState;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", uSex=" + uSex + ", uTel=" + uTel
				+ ", uState=" + uState + "]";
	}
	
	
	
	

}
