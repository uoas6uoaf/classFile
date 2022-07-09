package org.zerock.myapp;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@WebServlet(
		urlPatterns = { "/InitParams" }, 
		initParams = { 
				@WebInitParam(name = "dirPath", value = "DIR_PATH_VALUE"), 
				@WebInitParam(name = "userid", value = "USER_ID_VALUE")
		})
public class InitParamsServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String dirPath;
	private String userid;
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		log.trace("init(config) invoked.");
		
		String dirPath = config.getInitParameter("dirPath");
		String userid = config.getInitParameter("userid");
		
		this.dirPath = dirPath;
		this.userid = userid;
		
		log.info("\t+ 1. dirPath: {} ,userid: {}",dirPath,userid);
	}


	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		log.trace("service(req,res) invoked.");
	}

}
