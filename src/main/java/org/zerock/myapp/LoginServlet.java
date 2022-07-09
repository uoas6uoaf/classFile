package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;

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


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		log.trace("service(res,req) invoked.");
		
		String userid = req.getParameter("userid");
		String passwd = req.getParameter("passwd");
		
		log.info("\t userid: {}, passwd: {}",userid, passwd);
		
		res.setContentType("text/html; charset=utf8");
		
		@Cleanup
		PrintWriter out = res.getWriter();
		
		out.println("<html><body>");
		out.println("아이디 값: "+userid+"<br>");
		out.println("비밀번호 값: "+passwd+"<br>");
		out.println("</html></body>");
		
		out.flush();
	}

}
