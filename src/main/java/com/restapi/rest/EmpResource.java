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
		e1.setName("Shaik Fathima");
		e1.setEid(70840897);
		
		Emp e2=new Emp();
		e2.setName("Swathi");
		e2.setEid(81095678);
		list.add(e1);
		list.add(e2);
		return list;
	}
}
