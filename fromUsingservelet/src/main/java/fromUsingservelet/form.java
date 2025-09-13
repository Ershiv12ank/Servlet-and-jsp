package fromUsingservelet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/submitForm")
public class form extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("name1");
		String useremail = req.getParameter("email");
		
		PrintWriter out = resp.getWriter();
		out.print("Name: " + username);
		out.print("Email: " + useremail);
		
	}

}
