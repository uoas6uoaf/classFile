<%@ page language="java" 
    contentType="text/html; 
    charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% 
        String name="jeongSeon";
        int age =23;
    %>
    
    <h1>name: <%= name %> </h1>
    <h1>age: <%= age %> </h1>
    <h1>natonality: <%= "대한민국" %></h1>

</body>
</html>