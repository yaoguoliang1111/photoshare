package com.etc.entity;

public class AlbumSelectBean {
	
	private String aTitle;
	private String aDescription;
	
	private String createTime;
	private String pUrl;
	private int aLikes;
	private String  aId;
	
	private int co;//评论数量
	
	public AlbumSelectBean() {
		// TODO Auto-generated constructor stub
	}

	public String getaTitle() {
		return aTitle;
	}

	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}

	public String getaDescription() {
		return aDescription;
	}

	public void setaDescription(String aDescription) {
		this.aDescription = aDescription;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getpUrl() {
		return pUrl;
	}

	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}

	public int getaLikes() {
		return aLikes;
	}

	public void setaLikes(int aLikes) {
		this.aLikes = aLikes;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}

	public AlbumSelectBean(String aTitle, String aDescription, String createTime, String pUrl, int aLikes, String aId,
			int co) {
		super();
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.createTime = createTime;
		this.pUrl = pUrl;
		this.aLikes = aLikes;
		this.aId = aId;
		this.co = co;
	}

	@Override
	public String toString() {
		return "AlbumSelectBean [aTitle=" + aTitle + ", aDescription=" + aDescription + ", createTime=" + createTime
				+ ", pUrl=" + pUrl + ", aLikes=" + aLikes + ", aId=" + aId + ", co=" + co + "]";
	}

	

	
}
