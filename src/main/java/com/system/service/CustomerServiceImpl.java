package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.CustomerDAO;
import com.system.model.Customer;

import lk.system.slk.customer.CustomerListType;
import lk.system.slk.customer.CustomerType;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public String createOrSaveNewCustomerInfo(CustomerType customerType) {

		Customer newCustomer = new Customer();
		newCustomer.setId(customerType.getId());
		newCustomer.setName(customerType.getName());
		newCustomer.setAge(customerType.getAge());
		newCustomer.setAddress(customerType.getAddress());
		newCustomer.setPassword(customerType.getPassword());
		newCustomer.setDiscount(customerType.getDiscount());
		newCustomer.setEmail(customerType.getEmail());
		newCustomer.setRegistor(customerType.getRegistor());
		return customerDAO.insertNewCustomer(newCustomer);
	}

	@Override
	public CustomerType getCustomerInfo(int customerId) {

		Customer getCustomer = customerDAO.getCustomer(customerId);

		CustomerType customerType = new CustomerType();
		customerType.setId(getCustomer.getId());
		customerType.setName(getCustomer.getName());
		customerType.setAge(getCustomer.getAge());
		customerType.setAddress(getCustomer.getAddress());
		customerType.setPassword(getCustomer.getPassword());
		customerType.setDiscount(getCustomer.getDiscount());
		customerType.setEmail(getCustomer.getEmail());
		customerType.setRegistor(getCustomer.getRegistor());
		return customerType;
	}

	@Override
	public String updateCustomerInfo(CustomerType customerType) {

		Customer modifyCustomer = new Customer();
		modifyCustomer.setId(customerType.getId());
		modifyCustomer.setName(customerType.getName());
		modifyCustomer.setAge(customerType.getAge());
		modifyCustomer.setAddress(customerType.getAddress());
		modifyCustomer.setPassword(customerType.getPassword());
		modifyCustomer.setDiscount(customerType.getDiscount());
		modifyCustomer.setEmail(customerType.getEmail());
		modifyCustomer.setRegistor(customerType.getRegistor());
		return customerDAO.updateCustomer(modifyCustomer);
	}

	@Override
	public String deleteCustomerInfo(CustomerType customerType) {

		Customer removeCustomer = new Customer();
		removeCustomer.setId(customerType.getId());
		removeCustomer.setName(customerType.getName());
		removeCustomer.setAge(customerType.getAge());
		removeCustomer.setAddress(customerType.getAddress());
		removeCustomer.setPassword(customerType.getPassword());
		removeCustomer.setDiscount(customerType.getDiscount());
		removeCustomer.setEmail(customerType.getEmail());
		removeCustomer.setRegistor(customerType.getRegistor());
		return customerDAO.deleteCustomer(removeCustomer);
	}

	@Override
	public CustomerListType getAllCustomerInfo() {

		List<Customer> lstCustomer = customerDAO.getAllCustomer();
		CustomerListType customerListType = new CustomerListType();

		for(Customer customer : lstCustomer){
			CustomerType customerType = new CustomerType();
			customerType.setId(customer.getId());
			customerType.setName(customer.getName());
			customerType.setAge(customer.getAge());
			customerType.setAddress(customer.getAddress());
			customerType.setPassword(customer.getPassword());
			customerType.setDiscount(customer.getDiscount());
			customerType.setEmail(customer.getEmail());
			customerType.setRegistor(customer.getRegistor());
			customerListType.getCustomerType().add(customerType);
		}
		return customerListType;
	}
}