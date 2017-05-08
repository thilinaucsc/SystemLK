/**
 * 
 */
package com.system.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.Sale;

/**
 * @author thili
 *
 */

@Repository("saleDAO")
public class SaleDAOImpl implements SaleDAO{

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
	public String insertNewSale(Sale sale) {

		// inserts into database & return saleId (primary_key)
		int saleId = (Integer) sessionFactory.getCurrentSession().save(sale);
		return "Sale information saved successfully with Sale_ID " + saleId;
	}

	@Override
	@Transactional
	public Sale getSale(int saleId) {

		// retrieve sale based on the id supplied in the formal argument
		Sale sale = (Sale) sessionFactory.getCurrentSession().get(Sale.class, saleId);
		return sale;
	}

	@Override
	@Transactional
	public String updateSale(Sale sale) {

		// update database with sale information and return success msg
		sessionFactory.getCurrentSession().update(sale);
		return "Sale information updated successfully";
	}

	@Override
	@Transactional
	public String deleteSale(Sale sale) {

		// delete sale information and return success msg
		sessionFactory.getCurrentSession().delete(sale);
		return "Sale information deleted successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Sale> getAllSale() {

		// get all sale info from database
		List<Sale> lstSale = sessionFactory.getCurrentSession().createCriteria(Sale.class).list();
		return lstSale;
	}
}
