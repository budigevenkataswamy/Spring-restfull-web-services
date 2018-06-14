package com.venkat.springdemo.rest;

public class StudentErrorResponse {

	private int status;
	private String messege;
	private long timeStamp;
	
	public StudentErrorResponse() {
	}

	public StudentErrorResponse(int status, String messege, long timeStamp) {
		this.status = status;
		this.messege = messege;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}


