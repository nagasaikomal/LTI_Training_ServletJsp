package com.ltil.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ltil.bean.Customer;
import com.ltil.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao 
{
	DbUtil util = new DbUtil();
	Connection conn=null;

	
	
  @Override
	public List<Customer> getAllCustomers() 
	{
		List<Customer> myList=null;			
		try
		{		
			myList= new ArrayList<>();			
			conn= util.getDataSource();
			Statement stmt= conn.createStatement();			
			ResultSet rs= stmt.executeQuery("Select * from CUSTOMERS");			
			while(rs.next())
			{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double amt= rs.getFloat(3);
			Customer cust= new Customer(id,name,amt);
			myList.add(cust);		
			}
			return myList;	
			
		} catch (SQLException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(conn!=null)
				{
				conn.close();
				}
				
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return myList;	
	}

}