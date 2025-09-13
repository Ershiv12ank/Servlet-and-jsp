package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/loginForm")
public class Logiform extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String useremail = req.getParameter("email");
		String userpassword = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		if(useremail.endsWith("shivank@gmail.com") && userpassword.equals("12345")) {
			out.print("Success fully login");
		}
		else {
			out.print("Invalid user");
		}
	}

}
