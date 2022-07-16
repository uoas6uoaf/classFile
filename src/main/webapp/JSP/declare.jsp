<%@ page language="java"
contentType="text/html; 
charset=UTF-8" 
pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>declare</title>
</head>

<body>
    <h1>Lorem ipsum dolor sit amet.</h1>

    <%! 
    String initMesg = "jspInit 메소드";
    String delMesg = "jspDestroy 메소드";

    public void jspInit() {
        System.out.println(">>>>"+initMesg+"<<<<");
    }

    public void jspDestroy() {
        System.out.println(">>>>"+delMesg+"<<<<");
    }
    %>
    
</body>

</html>