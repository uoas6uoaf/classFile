<%@page language="java" 
contentType="text/html; 
charset=UTF-8"
pageEncoding="UTF-8" %>

<% 
    request.setCharacterEncoding("utf8");

    String userid = request.getParameter("userid");
    String passwd = request.getParameter("passwd");

    //1. 로그인 처리 - 무조건 성공이라 가정(단 아이디와 암호가 정상 수신된 경우에만)
    if((userid != null && !"".equals(userid)) && 
        (passwd != null && !"".equals(passwd))){

    } else{
        response.sendRedirect("/LoginForm.html");
        return;
    }//if-else

    //3.무엇을 해야하는가? 현재 로그인한 웹브라우저와 생명주기가 동일한 session scope에 login succeed 정보를 올려 놓아야함
    session.setAttribute("userid",userid);
    session.setAttribute("passwd",passwd);

%>


<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login.jsp</title>
</head>
<body>
    <h1>login.jsp</h1>
    <hr>

    <h1>로그인 정보 세션 저장</h1>


    <ul>
        <li>1. 안녕하세요 to <%= userid %></li>
        <li><a href="/JSP/loginInfo.jsp">정보보기</a></li>
    </ul>

</body>
</html>