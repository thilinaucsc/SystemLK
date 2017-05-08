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

import lk.system.slk.sale.SaleListType;
import lk.system.slk.sale.SaleType;

/**
 * @author thili
 *
 */

@Path("/saleservice")
public interface ISaleService {
	// Basic CRUD operations for Sale Service

	// http://localhost:8080/SystemLK/resteasy/saleservice/addsale -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleservice/addsale -
	// JBoss AS7
	@POST
	@Path("addsale")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String createOrSaveNewSaleInfo(SaleType saleType);

	// http://localhost:8080/SystemLK/resteasy/saleservice/getsale/1 -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleservice/getsale/1 -
	// JBoss AS7
	@GET
	@Path("getsale/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public SaleType getSaleInfo(@PathParam("id") int saleId);

	// http://localhost:8080/SystemLK/resteasy/saleservice/updatesale -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleservice/updatesale -
	// JBoss AS7
	@PUT
	@Path("updatesale")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String updateSaleInfo(SaleType saleType);

	// http://localhost:8080/SystemLK/resteasy/saleservice/deletesale -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleservice/deletesale -
	// JBoss AS7
	@DELETE
	@Path("deletesale")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String deleteSaleInfo(SaleType saleType);

	// http://localhost:8080/SystemLK/resteasy/saleservice/getallsale -
	// Tomcat 7.0.x
	// http://localhost:9090/SystemLK/resteasy/saleservice/getallsale -
	// JBoss AS7
	@GET
	@Path("getallsale")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public SaleListType getAllSaleInfo();
}
