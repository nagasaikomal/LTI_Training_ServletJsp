package com.ltil.bean;

public class Customer 
{
	int custId;
	String custName;
	double amount;
	
	public Customer(int custId, String custName, double amount) 
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.amount = amount;
	}

	public int getCustId() 
	{
		return custId;
	}

	public void setCustId(int custId) 
	{
		this.custId = custId;
	}

	public String getCustName() 
	{
		return custName;
	}

	public void setCustName(String custName) 
	{
		this.custName = custName;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	@Override
	public String toString() 
	{
		return "Customer [custId=" + custId + ", custName=" + custName + ", amount=" + amount + "]";
	}
	
	
	
	
}
