package com.bw.bean;

public class Fl {
	private Integer fid;
	private String fname;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Fl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fl [fid=" + fid + ", fname=" + fname + "]";
	}
	public Fl(Integer fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}
}
