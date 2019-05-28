<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gacon
  Date: 5/27/2019
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Đăng nhập</h1>
<form method="post">
    <div class="form-group">
        <label>Tên đăng nhập: </label><input type="text" id="username" name="username" class="form-control">
    </div>
    <div class="form-group">
        <label>Mật khẩu: </label><input type="password" id="password" name="password" class="form-control">
    </div>
    <div class="b">
        <button id="btn" type="button" class="btn btn-primary">Đăng nhập</button>
    </div>
    <a href="#">Quên mật khẩu</a>
    <script src="<c:url value="/resources/js/login.js"/>"></script>
</form>
</body>
</html>
