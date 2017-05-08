/**
 * 
 */
package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.CompanyDAO;
import com.system.model.Company;

import lk.system.slk.company.CompanyListType;
import lk.system.slk.company.CompanyType;

/**
 * @author thili
 *
 */

@Service
public class CompanyServiceImpl implements ICompanyService {

	@Autowired
	private CompanyDAO companyDAO;

	@Override
	public String createOrSaveNewCompanyInfo(CompanyType companyType) {

		Company newCompany = new Company();
		newCompany.setId(companyType.getId());
		newCompany.setName(companyType.getName());
		newCompany.setLocation(companyType.getLocation());
		newCompany.setUserID(companyType.getUserID());
		return companyDAO.insertNewCompany(newCompany);
	}

	@Override
	public CompanyType getCompanyInfo(int companyId) {

		Company getCompany = companyDAO.getCompany(companyId);

		CompanyType companyType = new CompanyType();
		companyType.setId(getCompany.getId());
		companyType.setName(getCompany.getName());
		companyType.setLocation(getCompany.getLocation());
		companyType.setUserID(getCompany.getUserID());
		return companyType;
	}

	@Override
	public String updateCompanyInfo(CompanyType companyType) {

		Company modifyCompany = new Company();
		modifyCompany.setId(companyType.getId());
		modifyCompany.setName(companyType.getName());
		modifyCompany.setLocation(companyType.getLocation());
		modifyCompany.setUserID(companyType.getUserID());
		return companyDAO.updateCompany(modifyCompany);
	}

	@Override
	public String deleteCompanyInfo(CompanyType companyType) {

		Company removeCompany = new Company();
		removeCompany.setId(companyType.getId());
		removeCompany.setName(companyType.getName());
		removeCompany.setLocation(companyType.getLocation());
		removeCompany.setUserID(companyType.getUserID());
		return companyDAO.deleteCompany(removeCompany);
	}

	@Override
	public CompanyListType getAllCompanyInfo() {

		List<Company> lstCompany = companyDAO.getAllCompany();
		CompanyListType companyListType = new CompanyListType();

		for (Company company : lstCompany) {
			CompanyType companyType = new CompanyType();
			companyType.setId(company.getId());
			companyType.setName(company.getName());
			companyType.setLocation(company.getLocation());
			companyType.setUserID(company.getUserID());
			companyListType.getCompanyType().add(companyType);
		}
		return companyListType;
	}
}
