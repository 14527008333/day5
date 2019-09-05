package com.bw.bean;

import java.sql.Date;

public class Dy {
	private Integer did;
	private String dname;
	private String jqjs;
	private String writer;
	private Date fxdate;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getJqjs() {
		return jqjs;
	}
	public void setJqjs(String jqjs) {
		this.jqjs = jqjs;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getFxdate() {
		return fxdate;
	}
	public void setFxdate(Date fxdate) {
		this.fxdate = fxdate;
	}
	
	public Dy() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dy [did=" + did + ", dname=" + dname + ", jqjs=" + jqjs + ", writer=" + writer + ", fxdate=" + fxdate
				+ "]";
	}
	public Dy(Integer did, String dname, String jqjs, String writer, Date fxdate) {
		super();
		this.did = did;
		this.dname = dname;
		this.jqjs = jqjs;
		this.writer = writer;
		this.fxdate = fxdate;
	}
}
