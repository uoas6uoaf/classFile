<%@ page language="java" contentType="texet/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.util.Date" import="java.until.Calendar" import="java.until.List" %>

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>현재 날자 출력 실습</h1>

    <%
    Date now = new Date();
    System.out.println("- now: "+now);

    int age = 23;
    %>

    <h2>Now: <%= now %></h2>
    <h2>1.이름: <%= "jeong seon" %></h2>
    <h2>2. 산술 연산식의 결과: <%= 10+100 %></h2>
    <h2>3. 나의 나이: <%= age %></h2>

</body>

</html>