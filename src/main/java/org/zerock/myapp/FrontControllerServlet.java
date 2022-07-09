package org.zerock.myapp;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		log.trace("service(req,res) invoked.");
		
		
		String empno = req.getParameter("empno");
		String ename = req.getParameter("ename");
		String sal = req.getParameter("sal");
		String deptno = req.getParameter("deptno");
		
		EmpDTO dto  = new EmpDTO();
		
		if(empno != null && !"".equals(empno)) {
			dto.setEmpno(Integer.parseInt(empno));
		}//if
		
		dto.setEname(ename);
		
		if(sal!= null && !"".equals(sal)) {
			dto.setSal(Double.parseDouble(sal));
		}//if
		
		if(deptno != null && !"".equals(deptno)) {
			dto.setDeptno(Integer.parseInt(deptno));
		}//if
		
		req.setAttribute(Service.DTO, dto);
				
	}



}
