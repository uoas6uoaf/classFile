<%@page language="java" 
contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" %>

<% 
    session.invalidate();       //세션파괴
    response.sendRedirect("/LoginForm.html");

   // RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginForm.html");
    //dispatcher.forward(request,response);
%>



 