<%--
  Created by IntelliJ IDEA.
  User: harsh
  Date: 08-01-2023
  Time: 11:28 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Complex Form</title>
    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
    />
</head>
<body style="background: #e2e2e2">
<div class="container mt-5 mb-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card mx-auto">
                <div class="card-body">
                    <h3 class="text-center">Complex Form</h3>
                    <div class="alert alert-danger" role="alert">
                        <form:errors path="cform.*" />
                    </div>
                    <form action="handle-complex-form" method="post" class="row g-3">
                        <div class="form-group mt-3">
                            <label for="name" class="form-label">Name</label>
                            <input
                                    type="text"
                                    name="name"
                                    placeholder="Enter name"
                                    class="form-control"
                                    id="name"
                            />
                        </div>
                        <div class="form-group mt-3">
                            <label for="Email1" class="form-label">Email address</label>
                            <input
                                    type="email"
                                    name="email"
                                    class="form-control"
                                    id="Email1"
                                    placeholder="Enter your email"
                                    aria-describedby="emailHelp"
                            />
                            <div id="emailHelp" class="form-text">
                                We'll never share your email with anyone else.
                            </div>
                        </div>
                        <div class="form-group mt-3">
                            <label for="user-id" class="form-label">User Id</label>
                            <input
                                    type="text"
                                    name="userid"
                                    placeholder="Enter user-id"
                                    class="form-control"
                                    id="user-id"
                            />
                        </div>
                        <div class="form-group mt-3">
                            <label for="dob" class="form-label">Date of Birth</label>
                            <input
                                    type="text"
                                    name="dob"
                                    placeholder="mm/dd/yyyy"
                                    class="form-control"
                                    id="dob"
                            />
                        </div>
                        <div class="form-group mt-3">
                            <label for="courses" class="form-label">Select Courses</label>
                            <select
                                    name="courses"
                                    id="courses"
                                    class="form-control"
                                    multiple
                            >
                                <option>Java</option>
                                <option>Python</option>
                                <option>Flutter</option>
                                <option>Kotlin</option>
                                <option>Spring and Spring Boot</option>
                                <option>Django</option>
                            </select>
                        </div>
                        <div class="form-group mt-3">
                            <span class="mr-3"> Select Gender </span>
                            <div class="form-check form-check-inline mt-2">
                                <input
                                        type="radio"
                                        class="form-check-input"
                                        name="gender"
                                        id="inlineradio1"
                                        value="Male"
                                />
                                <label for="inlineradio1" class="form-check-label"
                                >Male</label
                                >
                            </div>
                            <div class="form-check form-check-inline">
                                <input
                                        type="radio"
                                        class="form-check-input"
                                        name="gender"
                                        id="inlineradio2"
                                        value="Female"
                                />
                                <label for="inlineradio2" class="form-check-label"
                                >Female</label
                                >
                            </div>
                        </div>
                        <div class="form-group mt-3">
                            <label for="type" class="form-label">Select Type</label>
                            <select name="type" id="type" class="form-control">
                                <option value="oldStudent">Old Student</option>
                                <option value="normalStudent">Normal Student</option>
                            </select>
                        </div>
                        <div class="col-12">
                            <label for="inputAddress" class="form-label">Address</label>
                            <input type="text" class="form-control" id="inputAddress" name="address.address1" placeholder="1234 Main St">
                        </div>
                        <div class="col-12">
                            <label for="inputAddress2" class="form-label">Address 2</label>
                            <input type="text" class="form-control" id="inputAddress2" name="address.address2"
                                   placeholder="Apartment, studio, or floor">
                        </div>
                        <div class="col-md-4">
                            <label for="inputCity" class="form-label">City</label>
                            <input type="text" class="form-control" id="inputCity" name="address.city">
                        </div>
                        <div class="col-md-4">
                            <label for="inputState" class="form-label">State</label>
                            <select id="inputState" class="form-select" name="address.state">
                                <option>Gujarat</option>
                                <option>Maharashtra</option>
                                <option>Rajasthan</option>
                                <option>Kerala</option>
                            </select>
                        </div>
                        <div class="col-md-4">
                            <label for="inputZip" class="form-label">Zip</label>
                            <input type="number" class="form-control" id="inputZip" name="address.zipcode">
                        </div>
                        <div class="container text-center mt-3">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Option 1: Bootstrap Bundle with Popper -->
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"
></script>
</body>
</html>
