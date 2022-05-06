<%--
  Created by IntelliJ IDEA.
  User: nathanhaustveit
  Date: 5/5/22
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Register</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Create Account"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

        <div class="container">
        <form action="/register" method="POST">
            <div class="form-group mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="text" class="form-control" name="username" id="username">
            </div>
            <div class="form-group mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" name="email" id="email">
            </div>
            <div class="form-group mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" name="password" id="password">
            </div>

            <button type="submit" class="btn btn-primary">Create Account</button>
        </form>
        </div>
</body>
</html>
