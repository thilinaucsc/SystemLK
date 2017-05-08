/**
 * 
 */
package com.system.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.Item;

/**
 * @author thili
 *
 */

@Repository("itemDAO")
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public String insertNewItem(Item item) {

		// inserts into database & return itemId (primary_key)
		int itemId = (Integer) sessionFactory.getCurrentSession().save(item);
		return "Item information saved successfully with Item_ID " + itemId;
	}

	@Override
	@Transactional
	public Item getItem(int itemId) {

		// retrieve item based on the id supplied in the formal argument
		Item item = (Item) sessionFactory.getCurrentSession().get(Item.class, itemId);
		return item;
	}

	@Override
	@Transactional
	public String updateItem(Item item) {

		// update database with item information and return success msg
		sessionFactory.getCurrentSession().update(item);
		return "Item information updated successfully";
	}

	@Override
	@Transactional
	public String deleteItem(Item item) {

		// delete item information and return success msg
		sessionFactory.getCurrentSession().delete(item);
		return "Item information deleted successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Item> getAllItem() {

		// get all item info from database
		List<Item> lstItem = sessionFactory.getCurrentSession().createCriteria(Item.class).list();
		return lstItem;
	}
}
