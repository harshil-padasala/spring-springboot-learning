<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: harsh
  Date: 06-01-2023
  Time: 05:42 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is Help Page. Welcome to Spring MVC World.</h1>
<%
    String str = (String) request.getAttribute("str");
    Integer number = (Integer) request.getAttribute("int");
    List<String> list = (List<String>) request.getAttribute("list");
    LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>
<h3><%=str%>
</h3>
<h3><%=number%>
</h3>
<h3><%=list%>
</h3>
<h3><%=time%>
</h3>
</body>
</html>
