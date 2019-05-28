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
<div class="row">
    <ol class="breadcrumb" style="width: 100%;">
        <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
        <li class="breadcrumb-item"><a href="#">Diễn đàn</a></li>
        <li class="breadcrumb-item active" aria-current="page">Category</li>
    </ol>
</div>
<div class="row">
    <div class="title-post">
        <p>Ipsum is simply dummy text of the printing</p>
        <hr>
    </div>
</div>
<div class="row mt-2 mb-2">
    <div class="col-2 p-0">
        <div class="card" style="width: 100%;">
            <img class="card-img-top img-thumbnail" src="https://data2.m4v.me/files/users/avatar/1000055960.png"
                 alt="Card image cap">
            <div class="card-body">
                <h6 class="card-title">Admin</h6>
                <p><img src="https://data2.m4v.me/level/chienvang.gif"/></p>
                <p style="color: red">♥♥♥♥♥</p>
                <p style="color: #a111dc">Hổ báo trường mẫu giáo</p>
            </div>
        </div>
    </div>
    <div class="col-10 content-cmt">
        <kbd class="bg-primary like">5♥</kbd>
        <div class="content-cmt-top">
            <small>10/10/2010 21:14 | #1</small>
        </div>
        <div class="btn-like"><a href="#">Like</a></div>
        <div class="btn-quote"><a href="#">Trích</a></div>
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's
        standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
        a type specimen book. It has
        survived not only five centuries, but also the leap into electronic typesetting, remaining essentially
        unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
        and more recently with
        desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Why do we use it? It is a
        long established fact that a reader will be distracted by the readable content of a page when looking at its
        layout. The point
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's
        standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
        a type specimen
        book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining
        essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem
        Ipsum passages, and more
        recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Why do we use
        it Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the
        industry's standard
        dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type
        specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining
        essentially
        unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
        and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Why
        do we use it
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's
        standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
        a type specimen
        book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining
        essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem
        Ipsum passages, and more
        recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Why do we use
        it
    </div>

</div>
<form>
    <div class="row mt-5 mb-5">
        <div class="col-10">
            <input type="text" name="content" class="form-control">
        </div>
        <div class="col-2">
            <input type="submit" value="Gửi" class="btn btn-primary">
        </div>
    </div>
</form>
<script src="<c:url value="/resources/js/javascript-post.js"/>"></script>
