<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gacon
  Date: 5/29/2019
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${ category.categoryName}</title>
</head>
<body>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item" aria-current="page"><a href="${ pageContext.request.contextPath}/">Trang chủ</a></li>
        <li class="breadcrumb-item active" aria-current="page">${ category.categoryName}</li>
    </ol>
</nav>
<c:forEach items="${category.listPost}" var="list">
    <div class="list-new-post">
        <div class="noidung">
            <ul>
                <li>
                    <img src="http://via.placeholder.com/70x70" style="border-radius: 5px">
                </li>
                <li class="pl-2">
                    <p><kbd>${ list.category.categoryName }</kbd> 19 minute</p>
                    <p><a href="${list.category.id}/${ list.id}">${ list.title}</a></p>
                    <p>
                        <i class="fas fa-heart" id="heart"></i> ${ list.listLike.size()} <i class="fas fa-comment" id="cmt-icon"></i> ${ list.listComment.size()} <i
                            class="far fa-user"></i> ${ list.account.username}
                    </p>
                </li>
            </ul>
        </div>
    </div>
    <hr>
</c:forEach>
</body>
</html>
