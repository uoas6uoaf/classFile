package org.zerock.myapp.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
//@NoArgsConstructor

//@WebFilter("/*")
public class MyFilter 
	extends HttpFilter 
	implements Filter {
	       
	private static final long serialVersionUID = 1L;

	public MyFilter() {
        super();
        
        log.trace("Default constructor invoked.");
    }

    @Override
	public void destroy() {
	}

    @Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
		throws IOException, ServletException {
    	
    	log.trace("doFilter(req,res,chain) invoked.");
    	
    	log.info("1.Pre-processiong...");
    	
    	//더이상 필터 체인 뒤의 servlet에서 전송파라미터를 얻기전에 utf8 인코딩 작업을 생략하도록
    	req.setCharacterEncoding("utf8");
		
    	chain.doFilter(req, res);
    	
    	log.info("2.post-processiong...");
	}

    @Override
	public void init(FilterConfig fConfig) throws ServletException {
    	log.trace("init(fConfig) invoked.");
	}

}
