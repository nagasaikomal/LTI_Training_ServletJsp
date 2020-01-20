

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FrontController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Vehicle v1=new Vehicle(1111,"BMW");
		Vehicle v2=new Vehicle(2222, "Audi");
		
		Employee e1=new Employee(101, "Jay" ,5000,v1);
		Employee e2=new Employee(102, "Vijay" ,6000,v2);
		
		getServletContext().setAttribute("employee", e1);
		
		response.sendRedirect("employeeInfo.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
