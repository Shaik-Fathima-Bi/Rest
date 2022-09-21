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
		e1.setName("Priya");
		e1.setPoints(90);
		
		return e1;
	}
}
