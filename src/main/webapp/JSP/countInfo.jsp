<%@page language="java" 
contentType="text/html; 
charset=UTF-8" 
pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>countInfo.jsp</h1>
    <hr>
    <h1>방문자 수 조회하기 화면</h1>
    <% int count = (Integer)application.getAttribute("countValue"); %>

    현재까지 총 방문자 수: <%= count %>
</body>
</html>