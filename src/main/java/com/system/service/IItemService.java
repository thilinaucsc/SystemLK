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

import lk.system.slk.item.ItemListType;
import lk.system.slk.item.ItemType;

@Path("/itemservice")
public interface IItemService {

	// Basic CRUD operations for Item Service

		// http://localhost:8080/SystemLK/resteasy/itemservice/additem  - Tomcat 7.0.x
		// http://localhost:9090/SystemLK/resteasy/itemservice/additem  - JBoss AS7
		@POST
		@Path("additem")
		@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_FORM_URLENCODED})
		public String createOrSaveNewItemInfo(ItemType itemType);

		// http://localhost:8080/SystemLK/resteasy/itemservice/getitem/1  - Tomcat 7.0.x
		// http://localhost:9090/SystemLK/resteasy/itemservice/getitem/1  - JBoss AS7
		@GET
		@Path("getitem/{id}")
		@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
		@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
		public ItemType getItemInfo(@PathParam("id") int itemId);

		// http://localhost:8080/SystemLK/resteasy/itemservice/updateitem  - Tomcat 7.0.x
		// http://localhost:9090/SystemLK/resteasy/itemservice/updateitem  - JBoss AS7
		@PUT
		@Path("updateitem")
		@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_FORM_URLENCODED})
		public String updateItemInfo(ItemType itemType);

		// http://localhost:8080/SystemLK/resteasy/itemservice/deleteitem  - Tomcat 7.0.x
		// http://localhost:9090/SystemLK/resteasy/itemservice/deleteitem  - JBoss AS7
		@DELETE
		@Path("deleteitem")
		@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_FORM_URLENCODED})
		public String deleteItemInfo(ItemType itemType);

		// http://localhost:8080/SystemLK/resteasy/itemservice/getallitem  - Tomcat 7.0.x
		// http://localhost:9090/SystemLK/resteasy/itemservice/getallitem  - JBoss AS7
		@GET
		@Path("getallitem")
		@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
		@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
		public ItemListType getAllItemInfo();
}
