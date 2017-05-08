/**
 * 
 */
package com.system.dao;

import java.util.List;

import com.system.model.Sale;

/**
 * @author thili
 *
 */
public interface SaleDAO {

	public String insertNewSale(Sale sale);
	public Sale getSale(int saleId);
	public String updateSale(Sale sale);
	public String deleteSale(Sale sale);
	public List<Sale> getAllSale();
}
