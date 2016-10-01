package com.learn.restjersy.model;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/v1/employees")
public class EmployeeResource {
	private static Map<String, Employee> employees = new HashMap<String, Employee>();

 static {
         
         Employee employee1 = new Employee();
         employee1.setEmployeeId("11111");
         employee1.setEmployeeName("Dineh Rajput");
         employee1.setJobType("Sr.Software Engineer");
         employee1.setSalary(70000l);
         employee1.setAddress("Noida");
         employees.put(employee1.getEmployeeId(), employee1);
         
         Employee employee2 = new Employee();
         employee2.setEmployeeId("22222");
         employee2.setEmployeeName("Abhishek");
         employee2.setJobType("Marketing");
         employee2.setSalary(50000l);
         employee2.setAddress("New Delhi");
         employees.put(employee2.getEmployeeId(), employee2);
         
     }
 
 @POST
 @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
 @Produces({MediaType.TEXT_HTML})
 public Response createEmployee(Employee emp,@Context UriInfo uriInfo){
	
	 System.out.println("inside create>>"+emp.getEmployeeName());
	 Employee e = new Employee();
	 e.setEmployeeName(emp.getEmployeeName());
	 employees.put("33333", e);
	 UriBuilder builder = uriInfo.getAbsolutePathBuilder();
     builder.path("33333");
     return Response.created(builder.build()).build();
	
 }
 
 @POST
 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
 @Produces({MediaType.TEXT_HTML,MediaType.APPLICATION_JSON})
 public Response createEmployeeFromForm(@FormParam("name") String name,@FormParam("salary") long salary){
	 
	 Employee employee2 = new Employee();
	 employee2.setEmployeeId("1234");
     employee2.setEmployeeName("Abhishek");
     employee2.setJobType("Marketing");
     employee2.setSalary(50000l);
     employee2.setAddress("New Delhi");
     employees.put(employee2.getEmployeeId(), employee2);
	 
	 return Response.status(201).entity(employee2).build();
	 
 }
 
 @GET
 @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
 public Collection<Employee> getEmployees(){
	 return  employees.values();
 }
 
 @Path("{empId}")
 @GET
 @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
 public Employee getEmployee(@PathParam("empId") String empId){
	 return employees.get(empId);
 } 
 
 @Path("{empId}")
 @PUT
 @Consumes({MediaType.APPLICATION_JSON})
 @Produces({MediaType.TEXT_HTML,MediaType.APPLICATION_JSON})
 public Response updateEmployee(@PathParam("empId") String empId){
	 return Response.status(200).entity("").build();
 }
 
 @DELETE
 public Response deleteEmployee(@PathParam("empId") String empId){
	 return null;
 }
}
