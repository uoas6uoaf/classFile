package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@WebServlet({"/Hello","/test/hello","/text"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
			log.trace("doGet({},{}) invoked.",req,res);
			PrintWriter out = res.getWriter();
			out.println("<h1>World!!!!!!!</h1>");
			
			out.flush();
			out.close();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
			log.trace("doPost(res,req) invoked.");
			this.doGet(req, res);
	
	}//doGet

}// end class
