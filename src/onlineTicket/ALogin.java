/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineTicket;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
@WebServlet("/ALogin")
public class ALogin extends HttpServlet {

    
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("asdfgh");
        String emailid="123@yahoo.com";
        String pwd="123";
        
        String user=request.getParameter("email");
        String pass=request.getParameter("pwd");
        
        if(user!=null && pass!=null && user.equals(emailid) && pass.equals(pwd)){
            HttpSession session=request.getSession(true);
            session.setAttribute("email",user);
            session.setAttribute("pwd",pass);
            
            response.sendRedirect("movie.jsp");
        }
        else{
            String error="Invalid User Id or Password";
            ServletContext context=request.getServletContext();
            context.setAttribute("error",error);
            response.sendRedirect("admin.jsp");
            
         }
            
        
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
