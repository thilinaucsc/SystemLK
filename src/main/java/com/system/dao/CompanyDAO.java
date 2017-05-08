/**
 * 
 */
package com.system.dao;

import java.util.List;

import com.system.model.Company;

/**
 * @author thili
 *
 */
public interface CompanyDAO {
	
	public String insertNewCompany(Company company);
	public Company getCompany(int companyId);
	public String updateCompany(Company company);
	public String deleteCompany(Company company);
	public List<Company> getAllCompany();
}
