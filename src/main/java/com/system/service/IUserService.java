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

import lk.system.slk.user.UserListType;
import lk.system.slk.user.UserType;

/**
 * @author thili
 *
 */

@Path("/userservice")
public interface IUserService {
	// Basic CRUD operations for User Service

	// http://localhost:8080/SystemLK/resteasy/userservice/adduser -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/userservice/adduser -
	// JBoss AS7
	@POST
	@Path("adduser")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String createOrSaveNewUserInfo(UserType userType);

	// http://localhost:8080/SystemLK/resteasy/userservice/getuser/1 -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/userservice/getuser/1 -
	// JBoss AS7
	@GET
	@Path("getuser/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserType getUserInfo(@PathParam("id") int userId);

	// http://localhost:8080/SystemLK/resteasy/userservice/updateuser -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/userservice/updateuser -
	// JBoss AS7
	@PUT
	@Path("updateuser")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String updateUserInfo(UserType userType);

	// http://localhost:8080/SystemLK/resteasy/userservice/deleteuser -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/userservice/deleteuser -
	// JBoss AS7
	@DELETE
	@Path("deleteuser")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String deleteUserInfo(UserType userType);

	// http://localhost:8080/SystemLK/resteasy/userservice/getalluser -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/userservice/getalluser -
	// JBoss AS7
	@GET
	@Path("getalluser")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserListType getAllUserInfo();
}
