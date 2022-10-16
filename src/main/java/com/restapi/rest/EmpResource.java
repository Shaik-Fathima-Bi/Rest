package com.restapi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("emps")
public class EmpResource
{
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Emp getEmployee()
	{
		System.out.println("getEmployee() called..............");
		Emp e1=new Emp();
		e1.setName("Shaik Fathima");
		e1.setEid(70840897);
		
		return e1;
	}
}
