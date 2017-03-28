package onlineTicket;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		database usr=new database();

		String username = request.getParameter("username");
		//System.out.println(username);
		String password = request.getParameter("password");
		try {
			if(usr.validateuser(username, password))
			{
				HttpSession session = request.getSession();
				session.setAttribute("userid", username);
				session.setAttribute("password", password);
				ServletContext context = request.getServletContext();
			    context.setAttribute("name", username);
				//System.out.println("yo!");
				response.sendRedirect("index.jsp");
				//out.println("Login Successful!");
			}
//		System.out.println("hey");
			
			else if((username==""||username==null)&&(password==""||password==null))
			{
				String error = "Invalid credentials";
			    ServletContext context = request.getServletContext();
			    context.setAttribute("error", error);
			    response.sendRedirect("login.jsp");
				
			}
			else
			{
				String error = "Wrong username or password";
			    ServletContext context = request.getServletContext();
			    context.setAttribute("error", error);
			    response.sendRedirect("login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
