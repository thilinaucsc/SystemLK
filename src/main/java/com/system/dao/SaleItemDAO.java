/**
 * 
 */
package com.system.dao;

import java.util.List;

import com.system.model.SaleItem;

/**
 * @author thili
 *
 */
public interface SaleItemDAO {

	public String insertNewSaleItem(SaleItem saleItem);
	public SaleItem getSaleItem(int saleItemId);
	public String updateSaleItem(SaleItem saleItem);
	public String deleteSaleItem(SaleItem saleItem);
	public List<SaleItem> getAllSaleItem();
}
