<%@page 
    language="java" 
    contentType="text/html; 
    charset=UTF-8" 
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>loginInfo.jsp</title>
</head>
<body>
    <h1>로그인 정보 보기</h1>
    <hr>

    <%
        //현재의 웹브라우저가 로그인에 성공한 브라우저인지 아닌지 판단하고 로그인에 성공한 웹브라우저라면 '로그아웃' 링크생성

        //1.session scope에서 로그인 성공 정보(userid, passwd)획득 , 만일 없으면 리다이렉션을 이용해 로그인창으로 밀어냄
        String userid = (String)session.getAttribute("userid");
        String passwd = (String)session.getAttribute("passwd");

        if( userid != null && passwd != null){  //로그인 성공정보가 유효하다면 
    %>        
            <h2><a href="/JSP/logout.jsp">로그아웃</a></h2>
    <%
        }else{      //로그인 정보가 없다면 
            response.sendRedirect("/Loginform.html");
        	return;
        }   

    %> 

     <%-- 
        request.setCharacterEncoding("utf8");

        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
        
       // out.println("userid: "+ userid);
       // out.println("passwd: "+ passwd);
       System.out.println("1. userid: "+userid);		//콘솔에 출력
       System.out.println("2. passwd: "+passwd);
    %>--%>

    아이디값: <%= userid %> <br>
    비밀번호: <%= passwd %>  
    

</body>
</html>