package in.sp.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Welcome extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String useremail = req.getParameter("email");
		String userpass = req.getParameter("pass");
		PrintWriter out = resp.getWriter();
		
		if(useremail.equals("shivank@gmail.com") && userpass.equals("12345")) {
			//req.setAttribute("name_key", "Ershivank");
			
			HttpSession session = req.getSession();
			session.setAttribute("name_key", "ershivank");
			RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("Invalid username and password");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
