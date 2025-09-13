package in.sp.search;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet ("/searchEngine")
public class Search extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String searchweb = req.getParameter("url1");
		resp.sendRedirect("https://www.google.com/search?q=" + searchweb);
	}

}
