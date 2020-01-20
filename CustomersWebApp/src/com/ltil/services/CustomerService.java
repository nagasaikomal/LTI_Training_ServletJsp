package com.ltil.services;

import java.sql.SQLException;
import java.util.List;

import com.ltil.bean.Customer;

public interface CustomerService 
{
	public List<Customer> getAllCustomers() throws SQLException;
}
