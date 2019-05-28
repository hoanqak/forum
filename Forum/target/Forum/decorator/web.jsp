<%--
  Created by IntelliJ IDEA.
  User: gacon
  Date: 5/23/2019
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><dec:title>Home</dec:title></title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/> "/>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/post-css.css"/>"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
          integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
    <script src="<c:url value="/resources/js/jquery-3.4.1.min.js"/>"></script>
</head>
<body>

<!-- header -->
<c:if test="${sessionScope.user == null}">
    <div class="form-login">
        <div class="main-form">
            <h1 style="text-align: center">Đăng nhập</h1>
            <div class="btn-close">x</div>
            <form method="post">
                <div class="form-group">
                    <label>Tên đăng nhập: </label><input type="text" id="username" name="username" class="form-control">
                </div>
                <div class="form-group">
                    <label>Mật khẩu: </label><input type="password" id="password" name="password" class="form-control">
                </div>
                <div class="b">
                    <button type="button" id="btn" class="btn btn-primary">Đăng nhập</button>
                </div>
                <a href="#">Quên mật khẩu</a>
            </form>
        </div>
    </div>
    <script src="<c:url value="/resources/js/login.js"/>"></script>
</c:if>
<div class="container">
    <div class="row mb-5 position-sticky sticky-top">
        <div class="menu">
            <a href="${  pageContext.request.contextPath}">Trang chủ</a>
            <a href="${ pageContext.request.contextPath}/forum">Diễn đàn</a>
            <c:if test="${sessionScope.user == null}">
                <a id="login">Đăng nhập</a>
                <a href="${ pageContext.request.contextPath}/register">Đăng ký</a>
            </c:if>
        </div>
    </div>
    <!-- end header -->
    <dec:body/>
    <!-- footer -->
    <div class="row text-center">
        <div class="col-4" style="background-color: #036d96; height: 40px;">Liên hệ</div>
        <div class="col-4" style="background-color: #036d96; height: 40px;">Trợ giúp</div>
        <div class="col-4" style="background-color: #036d96; height: 40px;">Cộng đồng</div>
    </div>
</div>
</body>
</html>
