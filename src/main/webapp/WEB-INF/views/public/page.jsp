<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/9/8
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Title</title>
    <link rel="stylesheet" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/css/public/page.css"%>">
    <script  type="text/javascript" src="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/js/public/page.js"%>"></script>
</head>
<body>
<div class="pagination">
    <a href="javascript:;" id="left"><</a>
    <c:if  test="${pageNumber <=4}">
        <c:forEach var="index" begin="1" end="${pageNumber}">
            <a href="${index}" class="page">${index}</a>
        </c:forEach>
    </c:if>
    <c:if test="${pageNumber >4}">
        <a href="1" class="page">1</a>
        <a href="2" class="page">2</a>
        <a href="3" class="page">3</a>
        <a href="4" class="page">4</a>
        <a href="javascript:;" class="omit"></a>
        <a href="javascript:;" class="sum-page">${pageNumber}</a>
    </c:if>
    <a href="javascript:;" id="right">></a>
    <span>共有<span><c:out value="${count}"/></span>条</span>
    <span class="btn">跳转到</span>
    <input type="text" class="page-number">
    <span class="jump">确定</span>
</div>
</body>
</html>
