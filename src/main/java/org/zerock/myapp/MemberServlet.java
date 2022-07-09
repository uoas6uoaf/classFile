package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Cleanup;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@WebServlet("/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		log.trace("service(req,res) invoked.");
		
		req.setCharacterEncoding("utf-8");
		
		Enumeration<String> paramNames = req.getParameterNames();
		
		res.setContentType("text/html; charset=utf-8");
		
		@Cleanup
		PrintWriter out = res.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		
		out.print("<head>");
		out.print("<title>Response</title>");
		out.print("</head>");
		
		out.print("<body>");
		
		while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = req.getParameter(name);
			
			out.println("<h3>name: " + name + ", value: "+ value+"<h3>");
			
		}
			
		out.print("</body>");
		out.print("</html>");
		
		
		out.flush();
	}

}
