package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
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
@WebServlet("/PostPre")
public class PostPreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	public void init(ServletConfig config) throws ServletException {
		log.trace("init({}) invoked.",config);
	}

	@Override
	public void destroy() {
		log.trace("destory() invoked.");
	}
	
	//=========================================
	
	@PostConstruct
	void PostConstruct() {
		log.trace("PostConstruct() invoked.");
	}
	

	
	@PreDestroy
	void PreDestroy() {
		log.trace("PreDestroy() invoked.");
	}

	
	
	
	
	
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		log.trace("service(req,res) invoked.");
		res.setContentType("text/html; charset=utf8");
		
		@Cleanup
		PrintWriter out = res.getWriter();
		
		out.println("<h1>LifeCycleServlet</h1>");
		out.flush();
	}

}
