package com.etc.entity;

public class AlbumSelectBean {
	
	private String aTitle;
	private String aDescription;
	
	private String createTime;
	private String coverPictureURL;
	private int aLikes;
	private int aId;
	
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

	public String getCoverPictureURL() {
		return coverPictureURL;
	}

	public void setCoverPictureURL(String coverPictureURL) {
		this.coverPictureURL = coverPictureURL;
	}

	public int getaLikes() {
		return aLikes;
	}

	public void setaLikes(int aLikes) {
		this.aLikes = aLikes;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}

	public AlbumSelectBean(String aTitle, String aDescription, String createTime, String coverPictureURL, int aLikes,
			int aId, int co) {
		super();
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.createTime = createTime;
		this.coverPictureURL = coverPictureURL;
		this.aLikes = aLikes;
		this.aId = aId;
		this.co = co;
	}

	@Override
	public String toString() {
		return "AlbumSelectBean [aTitle=" + aTitle + ", aDescription=" + aDescription + ", createTime=" + createTime
				+ ", coverPictureURL=" + coverPictureURL + ", aLikes=" + aLikes + ", aId=" + aId + ", co=" + co + "]";
	}
	

	
}
