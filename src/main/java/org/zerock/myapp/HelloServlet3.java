package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

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

@WebServlet(
		name = "Hello3Servlet", 
		urlPatterns = { "/xxx", "/yyy"})
public class HelloServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
			log.trace("service(req,res) invoked.");
			
			// http request 메시지로부터 , 전송파라미터들을 얻어내기 위해서는 아래와 같이 함
//			String name = req.getParameter("name"); 		//전송 파라미터의 한의 값이 오직 1개일 때 사용
//			String age = req.getParameter("age");			
//			String[] hobby = req.getParameterValues("hobby");
//			
//			log.info("\t+ name: {}, age: {}",name,age);
//			log.info("\t+ hobby: {}",Arrays.toString(hobby));
			
			Enumeration<String> paramNames = req.getParameterNames();
			
//			while(paramNames.hasMoreElements()) {
//				String name = paramNames.nextElement();
//				log.info("\t name: {}",name);
//				
//			}
//			log.info("\t paramNames:"+ paramNames);
			
			
			Map<String, String[]> map = req.getParameterMap();
			log.info("\t map: {},hobby: {}",map,map.get("hobby"));
		
			
			PrintWriter out = res.getWriter();
			out.println("<h1>World!!!!!!!</h1>");
//			out.println("<h3>name: " + name+ "</h3>");
//			out.println("<h3>age: " + age+ "</h3>");
			out.flush();
			out.close();
	}//service

}//end class
