package net.sf.markov4jmeter.actionServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author Andre van Hoorn
 *
 */
public class ActionServlet extends HttpServlet {

	private static final long serialVersionUID = 7307404269994465985L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + this.getClass().getName() + "</h1>");
	      
	      HttpSession session = request.getSession(true);
	      out.println("session ID: " + session.getId());
	}
	
}
