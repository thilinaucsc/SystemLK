/**
 * 
 */
package com.system.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.Company;

/**
 * @author thili
 *
 */

@Repository("companyDAO")
public class CompanyDAOImpl implements CompanyDAO{

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
	public String insertNewCompany(Company company) {

		// inserts into database & return companyId (primary_key)
		int companyId = (Integer) sessionFactory.getCurrentSession().save(company);
		return "Company information saved successfully with Company_ID " + companyId;
	}

	@Override
	@Transactional
	public Company getCompany(int companyId) {

		// retrieve company based on the id supplied in the formal argument
		Company company = (Company) sessionFactory.getCurrentSession().get(Company.class, companyId);
		return company;
	}

	@Override
	@Transactional
	public String updateCompany(Company company) {

		// update database with company information and return success msg
		sessionFactory.getCurrentSession().update(company);
		return "Company information updated successfully";
	}

	@Override
	@Transactional
	public String deleteCompany(Company company) {

		// delete company information and return success msg
		sessionFactory.getCurrentSession().delete(company);
		return "Company information deleted successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Company> getAllCompany() {

		// get all company info from database
		List<Company> lstCompany = sessionFactory.getCurrentSession().createCriteria(Company.class).list();
		return lstCompany;
	}
}
