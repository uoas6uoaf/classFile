package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.Cleanup;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@WebServlet("/ScopeTests2")
public class ScopeTestsServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {

		
		
		ServletContext appScope = req.getServletContext();		//app.Scope관리 객체
		HttpSession sessionScope = req.getSession();			//session scope 관리 객체
		HttpServletRequest reqScope = req;						//Req. scope 관리 객체
		
		//======================================================================
		

		
		//1.application Scope 
		
		String getSharedDataFromAppScope= (String) appScope.getAttribute("APP_SCOPE");
		//=================================================================
//		응답문서 생성
		//================================================
		res.setContentType("text/html; charset=utf8");
		
		@Cleanup
		PrintWriter out = res.getWriter();
		
		out.println("<h1>APP.SCOPE에 공유데이터를 올려놓았습니다.</h1>");
		
		out.flush();
	}

}
