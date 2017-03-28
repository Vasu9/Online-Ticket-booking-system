package onlineTicket;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class movieDetails
 */
@WebServlet("/movieDetails")
public class movieDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		movie mov = new movie(); 
		database d = new database();
		String id = request.getParameter("movieId");
		long mid = Long.parseLong(id);
		try {
			mov = d.getmovies(mid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 //   String movieName = mov.getMovie(id);
/*		String movieName;
		
		switch(id){
        case "0":
            movieName = "Zero";
            break;
        case "1":
            movieName = "One";
            break;
        case "2":
            movieName = "Two";
            break;
        case "3":
            movieName = "Three";
            break;
        default:
            movieName = "Default Movie";
    }*/
	    ServletContext context = request.getServletContext();
        context.setAttribute("movieName", mov.getName());
        context.setAttribute("releasedate",mov.getReleasedate());
        context.setAttribute("duration", mov.getDuration());
        context.setAttribute("director", mov.getDirector());
        context.setAttribute("cast", mov.getCast());
        context.setAttribute("synopsis", mov.getSynopsis());
        context.setAttribute("genre", mov.getGenre());
        context.setAttribute("mid", mid);
        response.sendRedirect("movieDetails.jsp"); 
	}

	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        processRequest(request, response);
			    } 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        processRequest(request, response);
			    }

}
