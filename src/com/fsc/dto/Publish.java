package com.fsc.dto;

public class Publish {
	private int pubId;
	private String pubName;
	
	public Publish(int pubId, String pubName) {
		this.pubId = pubId;
		this.pubName = pubName;
	}
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	
}
