<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gacon
  Date: 5/23/2019
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
    <!-- content -->
    <div class="col-8">
        <!-- new post -->
        <div class="new-post mb-5 pb-2">
            <h5>Bài biết mới nhất</h5>
            <c:forEach items="${ newPost}" var="post">
                <div class="list-new-post">
                    <div class="noidung">
                        <ul>
                            <li>
                                <img src="http://via.placeholder.com/70x70" style="border-radius: 5px">
                            </li>
                            <li class="pl-2">
                                <p><kbd>${post.category.categoryName}</kbd> 19 minute</p>
                                <p><a href="${post.category.id}/${ post.id}">${ post.title}</a></p>
                                <p>
                                    <i class="far fa-heart" id="heart"></i> ${ post.listLike.size()} <i class="far fa-comment" id="cmt-icon"></i> ${ post.listComment.size()}  <i
                                        class="far fa-user"></i> ${ post.account.username}
                                </p>
                            </li>
                        </ul>
                    </div>
                </div>
                <hr>
            </c:forEach>
        </div>
        <!-- end new post -->

        <!-- category -->
        <div class="new-post mb-5 pb-2">
            <h5>Chuyên mục</h5>
            <c:forEach items="${ category }" var="category1">
                <div class="row mt-3 mb-3">
                    <div class="col-1 text-center p-3"><i class="fas fa-box-open"></i></div>
                    <div class="col-11">
                        <div class="row category-forum">
                            <a href="${ pageContext.request.contextPath}/${ category1.id}">${ category1.categoryName}</a>
                        </div>
                        <div class="row" style="font-size: 12px;">
                            Đề tài thảo luận: ${ category1.listPost.size()}
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <!-- end category -->
    <!-- side bar -->
    <div class="col-4">
        <div class="row small">
            <!-- <div class="title-silebar">Top Uploader</div> -->
            <div class="content-top">
                <div class="title-header">Top Uploader
                </div>
                <div class="main-content">
                    <span>1. <a href="#">Admin </a></span><em style="float: right">1000</em><br>
                    <span>1. <a href="#">Admin </a></span><em style="float: right">1000</em><br>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
