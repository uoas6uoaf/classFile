<%@ page language="java"
 isErrorPage="false"

 contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" %>
 
<!--  errorPage="/JSP/error.jsp" -->
<!-- 에러페이지 직접 지정 시 , web.xml의 지정한것보다 우선으로 동작 -->
 
<% int n = 4 / 0; %>