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

import lk.system.slk.saleitem.SaleItemListType;
import lk.system.slk.saleitem.SaleItemType;

/**
 * @author thili
 *
 */

@Path("/saleitemservice")
public interface ISaleItemService {
	// Basic CRUD operations for SaleItem Service

	// http://localhost:8080/SystemLK/resteasy/saleitemservice/addsaleitem -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleitemservice/addsaleitem -
	// JBoss AS7
	@POST
	@Path("addsaleitem")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String createOrSaveNewSaleItemInfo(SaleItemType saleitemType);

	// http://localhost:8080/SystemLK/resteasy/saleitemservice/getsaleitem/1 -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleitemservice/getsaleitem/1 -
	// JBoss AS7
	@GET
	@Path("getsaleitem/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public SaleItemType getSaleItemInfo(@PathParam("id") int saleItemId);

	// http://localhost:8080/SystemLK/resteasy/saleitemservice/updatesaleitem -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleitemservice/updatesaleitem -
	// JBoss AS7
	@PUT
	@Path("updatesaleitem")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String updateSaleItemInfo(SaleItemType saleItemType);

	// http://localhost:8080/SystemLK/resteasy/saleitemservice/deletesaleitem -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleitemservice/deletesaleitem -
	// JBoss AS7
	@DELETE
	@Path("deletesaleitem")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String deleteSaleItemInfo(SaleItemType saleItemType);

	// http://localhost:8080/SystemLK/resteasy/saleitemservice/getallsaleitem -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleitemservice/getallsaleitem -
	// JBoss AS7
	@GET
	@Path("getallsaleitem")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public SaleItemListType getAllSaleItemInfo();
}
