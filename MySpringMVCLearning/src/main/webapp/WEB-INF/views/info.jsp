<%--
  Created by IntelliJ IDEA.
  User: harsh
  Date: 06-01-2023
  Time: 11:19 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container text-center mt-5">
    <div class="row">
        <div class="col-md-4">
            <div class="card mx-auto">
                <div class="card-header">
                    <h1>Information</h1>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">${user.email}</li>
                    <li class="list-group-item">${user.userName}</li>
                    <li class="list-group-item">${user.password}</li>
                </ul>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>

</body>
</html>
