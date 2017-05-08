/**
 * 
 */
package com.system.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lk.system.slk.company.CompanyListType;
import lk.system.slk.company.CompanyType;

/**
 * @author thili
 *
 */
@Path("/companyservice")
public interface ICompanyService {
	
	// http://localhost:8080/SystemLK/resteasy/companyservice/addcompany -Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/companyservice/addcompany -JBoss AS7
	@POST
	@Path("addcompany")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String createOrSaveNewCompanyInfo(CompanyType companyType);

	// http://localhost:8080/SystemLK/resteasy/companyservice/getcompany/1 -  Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/companyservice/getcompany/1 - JBoss AS7
	@GET
	@Path("getcompany/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public CompanyType getCompanyInfo(@PathParam("id") int companyId);

	// http://localhost:8080/SystemLK/resteasy/companyservice/updatecompany - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/companyservice/updatecompany - JBoss AS7
	@PUT
	@Path("updatecompany")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String updateCompanyInfo(CompanyType companyType);

	// http://localhost:8080/SystemLK/resteasy/companyservice/deletecompany - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/companyservice/deletecompany - JBoss AS7
	@DELETE
	@Path("deletecompany")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String deleteCompanyInfo(CompanyType companyType);

	// http://localhost:8080/SystemLK/resteasy/companyservice/getallcompany - Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/companyservice/getallcompany - JBoss AS7
	@GET
	@Path("getallcompany")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public CompanyListType getAllCompanyInfo();
}
