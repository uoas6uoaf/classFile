<%@page 
language="java" 
contentType="text/html; charset=UTF-8" 
isErrorPage ="true" 
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
    <h1>/JSP/error</h1>
    <hr>
    <p>잠시 시스템에 문제가 발생했습니다.잠시 후에 다시 시도하여 주십시오.</p>

    <h1><%= exception.getClass() %> : <%= exception.getLocalizedMessage() %></h1>
	
    <ol>
	<%
		StackTraceElement[] stackTrace = exception.getStackTrace(); 
		for(StackTraceElement emlement : stackTrace){
	%>
		<li>at <%= emlement %></li>
	<%
		}
	%>
	</ol>
</body>
</html>