package com.etc.entity;

public class Picture {

private String pId;
private String pName;
private String pDate;
private String pUrl;



@Override
public String toString() {
	return "Picture [pId=" + pId + ", pName=" + pName + ", pDate=" + pDate + ", pUrl=" + pUrl + "]";
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
public Picture() {
	// TODO Auto-generated constructor stub
}
public Picture(String pId, String pName, String pUrl) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pUrl = pUrl;
}
	
}
