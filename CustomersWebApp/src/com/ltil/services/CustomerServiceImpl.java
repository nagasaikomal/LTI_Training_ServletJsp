package com.ltil.services;

import java.sql.SQLException;
import java.util.List;
import com.ltil.bean.Customer;
import com.ltil.dao.CustomerDao;
import com.ltil.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService 
{
	CustomerDao dao;
	
		public CustomerServiceImpl() throws SQLException 
		{
			dao=  new CustomerDaoImpl();
		}
		@Override
		public List<Customer> getAllCustomers() 
		{
		List<Customer> myList;
		
			myList = dao.getAllCustomers();
			return myList;
					
		}
	}

