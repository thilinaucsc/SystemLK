/**
 * 
 */
package com.system.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.SaleItem;

/**
 * @author thili
 *
 */

@Repository("saleItemDAO")
public class SaleItemDAOImpl implements SaleItemDAO{

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
	public String insertNewSaleItem(SaleItem saleItem) {

		// inserts into database & return saleItemId (primary_key)
		int saleItemId = (Integer) sessionFactory.getCurrentSession().save(saleItem);
		return "SaleItem information saved successfully with SaleItem_ID " + saleItemId;
	}

	@Override
	@Transactional
	public SaleItem getSaleItem(int saleItemId) {

		// retrieve saleItem based on the id supplied in the formal argument
		SaleItem saleItem = (SaleItem) sessionFactory.getCurrentSession().get(SaleItem.class, saleItemId);
		return saleItem;
	}

	@Override
	@Transactional
	public String updateSaleItem(SaleItem saleItem) {

		// update database with saleItem information and return success msg
		sessionFactory.getCurrentSession().update(saleItem);
		return "SaleItem information updated successfully";
	}

	@Override
	@Transactional
	public String deleteSaleItem(SaleItem saleItem) {

		// delete saleItem information and return success msg
		sessionFactory.getCurrentSession().delete(saleItem);
		return "SaleItem information deleted successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<SaleItem> getAllSaleItem() {

		// get all saleItem info from database
		List<SaleItem> lstSaleItem = sessionFactory.getCurrentSession().createCriteria(SaleItem.class).list();
		return lstSaleItem;
	}
}
