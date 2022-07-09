package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@WebServlet("/Sport")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//post방식의 한글처리
//		request.setCharacterEncoding("UTF-8");
		
		String [] sports = request.getParameterValues("sports");
		String sex = request.getParameter("sex");
		
		log.info("\t sex:{}",sex);
		log.info("\t sports: {}",Arrays.toString(sports));
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		for(String sport : sports) {
			out.print("좋아하는 운동: " + sport + "<br>");
		}
		out.print("성별: "+sex+"<br>");
		out.print("</body></html>");
		

	}

}
