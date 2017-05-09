/**
 * 
 */
package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.ItemDAO;
import com.system.model.Item;

import lk.system.slk.item.ItemListType;
import lk.system.slk.item.ItemType;

/**
 * @author thili
 *
 */

@Service
public class ItemServiceImpl implements IItemService{
	@Autowired
	private ItemDAO itemDAO;

	@Override
	public String createOrSaveNewItemInfo(ItemType itemType) {

		Item newItem = new Item();
		newItem.setId(itemType.getId());
		newItem.setName(itemType.getName());
		newItem.setPrice(itemType.getPrice());
		newItem.setDiscount(itemType.getDiscount());
		newItem.setThing(itemType.getThing());
		newItem.setCompanyId(itemType.getCompanyId());
		return itemDAO.insertNewItem(newItem);
	}

	@Override
	public ItemType getItemInfo(int itemId) {

		Item getItem = itemDAO.getItem(itemId);

		ItemType itemType = new ItemType();
		itemType.setId(getItem.getId());
		itemType.setName(getItem.getName());
		itemType.setPrice(getItem.getPrice());
		itemType.setDiscount(getItem.getDiscount());
		itemType.setThing(getItem.getThing());
		itemType.setCompanyId(getItem.getCompanyId());
		return itemType;
	}

	@Override
	public String updateItemInfo(ItemType itemType) {

		Item modifyItem = new Item();
		modifyItem.setId(itemType.getId());
		modifyItem.setName(itemType.getName());
		modifyItem.setPrice(itemType.getPrice());
		modifyItem.setDiscount(itemType.getDiscount());
		modifyItem.setThing(itemType.getThing());
		modifyItem.setCompanyId(itemType.getCompanyId());
		return itemDAO.updateItem(modifyItem);
	}

	@Override
	public String deleteItemInfo(ItemType itemType) {

		Item removeItem = new Item();
		removeItem.setId(itemType.getId());
		removeItem.setName(itemType.getName());
		removeItem.setPrice(itemType.getPrice());
		removeItem.setDiscount(itemType.getDiscount());
		removeItem.setThing(itemType.getThing());
		removeItem.setCompanyId(itemType.getCompanyId());
		return itemDAO.deleteItem(removeItem);
	}

	@Override
	public ItemListType getAllItemInfo() {

		List<Item> lstItem = itemDAO.getAllItem();
		ItemListType itemListType = new ItemListType();

		for(Item item : lstItem){
			ItemType itemType = new ItemType();
			itemType.setId(item.getId());
			itemType.setName(item.getName());
			itemType.setPrice(item.getPrice());
			itemType.setDiscount(item.getDiscount());
			itemType.setThing(item.getThing());
			itemType.setCompanyId(item.getCompanyId());
			itemListType.getItemType().add(itemType);
		}
		return itemListType;
	}
}
