package com.restapi.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("emps")
public class EmpResource
{
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Emp> getEmployee()
	{
		System.out.println("getEmployee() called..............");
		List<Emp> list= new ArrayList<Emp>();
		Emp e1=new Emp();
		e1.setName("Employee1");
		e1.setEid(70840897);
		Emp e2=new Emp();
		e2.setName("Employee2");
		e2.setEid(81095678);
		Emp e3=new Emp();
		e3.setName("Employee3");
		e3.setEid(73315678);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
	}
}
