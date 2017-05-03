package com.system.service;

import lk.system.slk.customer.CustomerListType;
import lk.system.slk.customer.CustomerType;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customerservice")
public interface ICustomerService {

	// Basic CRUD operations for Customer Service

	// http://localhost:8080/SystemLK/resteasy/customerservice/addcustomer  - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/customerservice/addcustomer  - JBoss AS7
	@POST
	@Path("addcustomer")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	public String createOrSaveNewCustomerInfo(CustomerType customerType);

	// http://localhost:8080/SystemLK/resteasy/customerservice/getcustomer/1  - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/customerservice/getcustomer/1  - JBoss AS7
	@GET
	@Path("getcustomer/{id}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public CustomerType getCustomerInfo(@PathParam("id") int customerId);

	// http://localhost:8080/SystemLK/resteasy/customerservice/updatecustomer  - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/customerservice/updatecustomer  - JBoss AS7
	@PUT
	@Path("updatecustomer")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	public String updateCustomerInfo(CustomerType customerType);

	// http://localhost:8080/SystemLK/resteasy/customerservice/deletecustomer  - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/customerservice/deletecustomer  - JBoss AS7
	@DELETE
	@Path("deletecustomer")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	public String deleteCustomerInfo(CustomerType customerType);

	// http://localhost:8080/SystemLK/resteasy/customerservice/getallcustomer  - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/customerservice/getallcustomer  - JBoss AS7
	@GET
	@Path("getallcustomer")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public CustomerListType getAllCustomerInfo();
}