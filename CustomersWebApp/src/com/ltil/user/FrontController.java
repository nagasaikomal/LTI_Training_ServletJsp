package com.ltil.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ltil.bean.Customer;
import com.ltil.services.CustomerService;
import com.ltil.services.CustomerServiceImpl;

@WebServlet("*.do")
public class FrontController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public FrontController() 
    {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String command = (request.getServletPath());
		System.out.println(command);
		
		RequestDispatcher dispatch = null;
		List<Customer> myList = null;   
		
		String jspName="";
		Customer customer = null;		
		CustomerService myService=null;
		
		switch(command)
		{
		case "/GetAllCustomers.do": 
				{
					try
					{
						myService = new CustomerServiceImpl();						
						myList=myService.getAllCustomers();
						
						request.setAttribute("myList", myList);
					
					} 
				catch (SQLException e) 
				{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
				jspName = "/GetAllCustomerDetails.jsp";							
				break;
				}
					default:
				{
					jspName="/index.jsp";
					break;
				}				
		}
		dispatch = request.getRequestDispatcher(jspName);
		dispatch.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
