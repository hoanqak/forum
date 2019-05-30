<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gacon
  Date: 5/27/2019
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<div class="show">--%>
<%--    <div class="btn-cancel"><i style="font-size: 30px" class="fas fa-window-close"></i></div>--%>
<%--    <div class="show-dialog">--%>
<%--        <small>Admin</small>--%>
<%--        <hr>--%>
<%--        <small>k0pehaykh0k</small>--%>
<%--    </div>--%>
<%--</div>--%>
<html>
<head>
<title>${ post.title } - ${ post.category.categoryName}</title>
</head>
<body>
<div class="row">
    <ol class="breadcrumb" style="width: 100%;">
        <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
        <li class="breadcrumb-item"><a href="#">Diễn đàn</a></li>
        <li class="breadcrumb-item active" aria-current="page">Category</li>
    </ol>
</div>
<div class="row">
    <div class="title-post">
        <p>${ post.title}</p>
        <hr>
    </div>
</div>
<div class="row mt-2 mb-2">
    <div class="col-2 p-0">
        <div class="card" style="width: 100%;">
            <img class="card-img-top img-thumbnail" src="https://kenh14cdn.com/Images/Uploaded/Share/2011/05/19/190511co3la1.jpg"
                 alt="Card image cap">
            <div class="card-body">
                <h6 class="card-title">${ post.account.username}</h6>
                <p><img src="https://data2.m4v.me/level/chienvang.gif"/></p>
                <p style="color: red">♥♥♥♥♥</p>
                <p style="color: #a111dc">Hổ báo trường mẫu giáo</p>
            </div>
        </div>
    </div>
    <div class="col-10 content-cmt">
        <kbd class="bg-primary like">${ post.listLike.size()}♥</kbd>
        <div class="content-cmt-top">
            <small>10/10/2010 21:14 | #1</small>
        </div>
        <div class="btn-like"><a href="#">Like</a></div>
        <div class="btn-quote"><a href="#">Trích</a></div>
        ${ post.longDescription}
    </div>
</div>
<c:set var="id" value="1"/>
<c:forEach items="${ post.listComment}" var="cmt">
    <div class="row mt-2 mb-2">
        <div class="col-2 p-0">
            <div class="card" style="width: 100%;">
                <img class="card-img-top img-thumbnail" src="https://kenh14cdn.com/Images/Uploaded/Share/2011/05/19/190511co3la1.jpg"
                     alt="Card image cap">
                <div class="card-body">
                    <h6 class="card-title">${ cmt.account.username}</h6>
                    <p><img src="https://data2.m4v.me/level/chienvang.gif"/></p>
                    <p style="color: red">♥♥♥♥♥</p>
                    <p style="color: #a111dc">Hổ báo trường mẫu giáo</p>
                </div>
            </div>
        </div>
        <div class="col-10 content-cmt">
            <kbd class="bg-primary like">♥</kbd>
            <div class="content-cmt-top">
                <small>${ cmt.createDate} | #${ id }</small>
                <c:set var="id" value="${ id + 1 }"/>
            </div>
            <div class="btn-like"><a href="#">Like</a></div>
            <div class="btn-quote"><a href="#">Trích</a></div>
                ${ cmt.content}
        </div>
    </div>
</c:forEach>
<c:if test="${ sessionScope.user != null}">
    <form method="post">
        <div class="row mt-5 mb-5">
            <div class="col-10">
                <input type="text" name="content" id="content" class="form-control">
            </div>
            <div class="col-2">
                <button id="btn-send-comment" type="button" class="btn btn-primary">Gửi</button>
            </div>
        </div>
    </form>
</c:if>
<script src="<c:url value="/resources/js/javascript-post.js"/>"></script>

</body>
</html>

