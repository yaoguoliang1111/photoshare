package com.etc.entity;

public class Album {
	private String pId;
	private String aId;
	private String aTitle;
	private String aDescription;
	private int tId;
	private String createTime;
	private String coverPId;
	private int aLikes;
	private int uId;
	private int aState;
	private String pName;
	private String pDate;
	private String pUrl;
	
	
	public Album(String aTitle, String aDescription, int tId, int uId,int aState) {
		super();
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.tId = tId;
		this.uId = uId;
		this.aState = aState;

	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
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
	
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
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
	public String getcoverPId() {
		return coverPId;
	}
	public void setcoverPIdURL(String coverPId) {
		this.coverPId = coverPId;
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
	
	
	public Album(String aId, String aTitle, String aDescription, int tId, String createTime, String coverPId,
			int aLikes, int uId, int aState) {
		super();
		this.aId = aId;
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.tId = tId;
		this.createTime = createTime;
		this.coverPId = coverPId;
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
	public Album(String pId, String aId, String aTitle, String aDescription, int tId, String createTime,
			String coverPId, int aLikes, int uId, int aState, String pName, String pDate, String pUrl) {
		super();
		this.pId = pId;
		this.aId = aId;
		this.aTitle = aTitle;
		this.aDescription = aDescription;
		this.tId = tId;
		this.createTime = createTime;
		this.coverPId = coverPId;
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
				+ tId + ", createTime=" + createTime + ", coverPId=" + coverPId + ", aLikes=" + aLikes
				+ ", uId=" + uId + ", aState=" + aState + ", pName=" + pName + ", pDate=" + pDate + ", pUrl=" + pUrl
				+ "]";
	}
	
	
	


	
	

}
