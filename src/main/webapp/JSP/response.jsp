<%@page language="java" 
contentType="text/html; 
charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>repponse</title>
</head>
<body>
    <% 
        response.sendRedirect("responseRedirect.jsp");
    %>
</body>
</html>