/**
 * 
 */
package com.system.dao;

import java.util.List;

import com.system.model.Item;

/**
 * @author thili
 *
 */
public interface ItemDAO {
	
	public String insertNewItem(Item item);
	public Item getItem(int itemId);
	public String updateItem(Item item);
	public String deleteItem(Item item);
	public List<Item> getAllItem();
}
