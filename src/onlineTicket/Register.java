package onlineTicket;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		//System.out.println(name);
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		if(name==null||name==""||email==null||email==""||pass==null||pass==""||phone==null||phone=="")
		{
			String error = "*All fields are necessary";
            ServletContext context = request.getServletContext();
            context.setAttribute("error", error);
            response.sendRedirect("Register.jsp");
		}
		else{
			customer newUser= new customer();
			newUser.setName(name);
			newUser.setEmail(email);
			newUser.setPassword(pass);
			newUser.setPhoneno(phone);
			
			database user = new database();
			try {
				if(user.adduser(newUser))
				{
					HttpSession session = request.getSession();
					session.setAttribute("userid", name);
					session.setAttribute("password", pass);
					ServletContext context = request.getServletContext();
				    context.setAttribute("name", name);
					//System.out.println("yo!");
					response.sendRedirect("index.jsp");
				}
				else
					response.sendRedirect("error");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			//response.sendRedirect("index.jsp");
		}
		}
	}


