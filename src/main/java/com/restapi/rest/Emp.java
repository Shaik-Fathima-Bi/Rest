package com.restapi.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Emp
{
	private String name;
	private int eid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
}
