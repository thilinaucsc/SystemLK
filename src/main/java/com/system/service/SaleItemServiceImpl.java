/**
 * 
 */
package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.SaleItemDAO;
import com.system.model.SaleItem;

import lk.system.slk.saleitem.SaleItemListType;
import lk.system.slk.saleitem.SaleItemType;

@Service
public class SaleItemServiceImpl implements ISaleItemService{
	
	@Autowired
	private SaleItemDAO saleItemDAO;

	@Override
	public String createOrSaveNewSaleItemInfo(SaleItemType saleItemType) {

		SaleItem newSaleItem = new SaleItem();
		newSaleItem.setId(saleItemType.getId());
		newSaleItem.setDiscount(saleItemType.getDiscount());
		newSaleItem.setTotalPrice(saleItemType.getTotalPrice());
		newSaleItem.setItemId(saleItemType.getItemId());
		newSaleItem.setSaleId(saleItemType.getSaleId());
		return saleItemDAO.insertNewSaleItem(newSaleItem);
	}

	@Override
	public SaleItemType getSaleItemInfo(int saleItemId) {

		SaleItem getSaleItem = saleItemDAO.getSaleItem(saleItemId);

		SaleItemType saleItemType = new SaleItemType();
		saleItemType.setId(getSaleItem.getId());
		saleItemType.setDiscount(getSaleItem.getDiscount());
		saleItemType.setTotalPrice(getSaleItem.getTotalPrice());
		saleItemType.setItemId(getSaleItem.getItemId());
		saleItemType.setSaleId(getSaleItem.getSaleId());
		return saleItemType;
	}

	@Override
	public String updateSaleItemInfo(SaleItemType saleItemType) {

		SaleItem modifySaleItem = new SaleItem();
		modifySaleItem.setId(saleItemType.getId());
		modifySaleItem.setDiscount(saleItemType.getDiscount());
		modifySaleItem.setTotalPrice(saleItemType.getTotalPrice());
		modifySaleItem.setItemId(saleItemType.getItemId());
		modifySaleItem.setSaleId(saleItemType.getSaleId());
		return saleItemDAO.updateSaleItem(modifySaleItem);
	}

	@Override
	public String deleteSaleItemInfo(SaleItemType saleItemType) {

		SaleItem removeSaleItem = new SaleItem();
		removeSaleItem.setId(saleItemType.getId());
		removeSaleItem.setDiscount(saleItemType.getDiscount());
		removeSaleItem.setTotalPrice(saleItemType.getTotalPrice());
		removeSaleItem.setItemId(saleItemType.getItemId());
		removeSaleItem.setSaleId(saleItemType.getSaleId());
		return saleItemDAO.deleteSaleItem(removeSaleItem);
	}

	@Override
	public SaleItemListType getAllSaleItemInfo() {

		List<SaleItem> lstSaleItem = saleItemDAO.getAllSaleItem();
		SaleItemListType saleItemListType = new SaleItemListType();

		for (SaleItem saleItem : lstSaleItem) {
			SaleItemType saleItemType = new SaleItemType();
			saleItemType.setId(saleItem.getId());
			saleItemType.setDiscount(saleItem.getDiscount());
			saleItemType.setTotalPrice(saleItem.getTotalPrice());
			saleItemType.setItemId(saleItem.getItemId());
			saleItemType.setSaleId(saleItem.getSaleId());
			saleItemListType.getSaleItemType().add(saleItemType);
		}
		return saleItemListType;
	}
}
