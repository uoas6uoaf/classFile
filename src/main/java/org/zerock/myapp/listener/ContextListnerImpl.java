package org.zerock.myapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import lombok.extern.log4j.Log4j2;

@Log4j2
//@NoArgsConstructor


//@WebListener
public class ContextListnerImpl implements ServletContextListener {

	
//	public ContextListnerImpl() {
//		log.trace("default constructor invoked.");
//	}
	
	@Override
    public void contextDestroyed(ServletContextEvent sce)  { 
		log.trace("contextDestroyed({}) invoked.",sce);
    }

	@Override
    public void contextInitialized(ServletContextEvent sce)  { 
		log.trace("contextInitialized({}) invoked.",sce);
    }
	
}
