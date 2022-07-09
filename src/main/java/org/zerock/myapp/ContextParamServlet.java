package org.zerock.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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

@WebServlet("/ContextParam")
public class ContextParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private String jdbcDriver;
	private String savePath;
	
	@Override
	public void init(ServletConfig config) 
		throws ServletException {
		log.trace("init(config) invoked");
		
		ServletContext sc = config.getServletContext();
		
		this.jdbcDriver = sc.getInitParameter("jdbcDriver");
		this.savePath = sc.getInitParameter("savePath");
		
		log.info("\t jdbcDriver: {}",jdbcDriver);
		log.info("\t savePath: {}",savePath);
		
		log.info("upload done");
		
		
//		sc.setAttribute(name, value);		//application Scope에 공유데이터(객체)를 올려 놓음
//		sc.getAttribute(name);				//application Scope에 공유데이터를 가져옴
//		sc.removeAttribute(name);			//application Scope에 공유데이터를 삭제
		
		sc.setAttribute("jdbcDriver", jdbcDriver);
		sc.setAttribute("savePath", savePath);
		
		
//		super.init(config);
	}
 
	@Override
	public void destroy() {
		log.trace("destory invoked");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		
		log.trace("service(res,req) invoked");

//		ServletContext ctx = this.getServletContext();
//		
//		String jdbcDriver = ctx.getInitParameter("jdbcDriver");
//		String savePath = ctx.getInitParameter("savePath");
		
		//응답문서 준비
		res.setContentType("text/html; charset=utf-8");
		
		@Cleanup
		PrintWriter out = res.getWriter();
		out.println("1.jdbcDriver: "+jdbcDriver);
		out.println(String.format("2.savePath: %s", savePath));
		
		out.flush();
		
	}

}
