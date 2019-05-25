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
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
    <script src="<c:url value="/resources/js/jquery-3.4.1.min.js"/>"></script>
</head>
<body>

<div class="container shadow-sm p-3 mb-5 bg-white rounded">
    <!-- header -->
    <div class="row menu mb-5 position-sticky sticky-top">
        <ul>
            <li><a href="#">Trang chủ</a></li>
            <li><a href="#">Diễn đàn</a></li>
            <li><a href="#">Đăng nhập</a></li>
            <li><a href="#">Đăng ký</a></li>
            <li></li>
        </ul>

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
