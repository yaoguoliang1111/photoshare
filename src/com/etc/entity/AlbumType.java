package com.etc.entity;

public class AlbumType {
	private int tId;
	private String tName;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	public AlbumType() {
		// TODO Auto-generated constructor stub
	}
	public AlbumType(int tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "AlbumType [tId=" + tId + ", tName=" + tName + "]";
	}
	

}
