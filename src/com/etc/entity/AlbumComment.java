package com.etc.entity;

public class AlbumComment {
	
	private int cId;
	private String cContent;
	private String uName;
	private String cDate;
	
	
	public int getcId() {
		return cId;
	} 
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public AlbumComment() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlbumComment [cId=" + cId + ", cContent=" + cContent + ", uName=" + uName + ", cDate=" + cDate + "]";
	}
	public AlbumComment(int cId, String cContent, String uName, String cDate) {
		super();
		this.cId = cId;
		this.cContent = cContent;
		this.uName = uName;
		this.cDate = cDate;
	}
	
	

	
	
	

}
