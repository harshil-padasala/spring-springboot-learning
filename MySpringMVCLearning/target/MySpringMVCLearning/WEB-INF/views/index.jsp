<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: harsh
  Date: 04-01-2023
  Time: 10:19 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-body">
            <h1>This is our index page.</h1>
            <h2>My name is Harshil.</h2>
            <h3>Welcome to Spring MVC World.<h1>Index</h1></h3>
            <h1>Data Sending Test</h1>
            <hr>
            <%
                String str = (String) request.getAttribute("str");
                Integer number = (Integer) request.getAttribute("int1");
                List<String> list = (List<String>) request.getAttribute("list");
            %>

            <div class="row mx-auto">
                <div class="col-md-4">
                    <div class="card">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item"><%=str%>
                            </li>
                            <li class="list-group-item"><%=number%>
                            </li>
                            <%
                                for (String s : list) {
                            %>
                            <li class="list-group-item">
                                <%=s%>
                            </li>
                            <%
                                }
                            %>
                        </ul>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">
                                <a class="btn btn-primary" href="complex_form1">Complex Form 1</a>
                            </li>
                            <li class="list-group-item">
                                <a class="btn btn-primary" href="contact">Contact</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

</body>
</html>
