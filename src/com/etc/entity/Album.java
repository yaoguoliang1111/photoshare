package com.etc.entity;

public class Album {
	private int pId;
	private int aId;
	private String aTitle;
	private String aDescription;
	private int tId;
	private String createTime;
	private String coverPictureURL;
	private int aLikes;
	private int uId;
	private int aState;
	private String pName;
	private String pDate;
	private String pUrl;

	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public String getpUrl() {
		return pUrl;
	}
	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
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
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
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
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getaState() {
		return aState;
	}
	public void setaState(int aState) {
		this.aState = aState;
	}
	
	
	public Album(int aId, String aTitle, String aDescription, int tId, String createTime, String coverPictureURL,
			int aLikes, int uId, int aState) {
		super();
		this.aId = aId;
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.tId = tId;
		this.createTime = createTime;
		this.coverPictureURL = coverPictureURL;
		this.aLikes = aLikes;
		this.uId = uId;
		this.aState = aState;
	}
	
	public Album(String pUrl) {
		super();
		this.pUrl = pUrl;
	}
	public Album() {
		// TODO Auto-generated constructor stub
	}
	public Album(int pId, int aId, String aTitle, String aDescription, int tId, String createTime,
			String coverPictureURL, int aLikes, int uId, int aState, String pName, String pDate, String pUrl) {
		super();
		this.pId = pId;
		this.aId = aId;
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.tId = tId;
		this.createTime = createTime;
		this.coverPictureURL = coverPictureURL;
		this.aLikes = aLikes;
		this.uId = uId;
		this.aState = aState;
		this.pName = pName;
		this.pDate = pDate;
		this.pUrl = pUrl;
	}
	@Override
	public String toString() {
		return "Album [pId=" + pId + ", aId=" + aId + ", aTitle=" + aTitle + ", aDescription=" + aDescription + ", tId="
				+ tId + ", createTime=" + createTime + ", coverPictureURL=" + coverPictureURL + ", aLikes=" + aLikes
				+ ", uId=" + uId + ", aState=" + aState + ", pName=" + pName + ", pDate=" + pDate + ", pUrl=" + pUrl
				+ "]";
	}
	
	
	


	
	

}
