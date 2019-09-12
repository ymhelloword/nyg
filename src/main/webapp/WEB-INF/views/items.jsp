<%@ page import="com.nyg.ssm.controller.Item" %><%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/6/19
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    String ip_port = request.getScheme()+"://"+ request.getServerName() + ":" + request.getServerPort();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/css/items-style.css">
    <link rel="stylesheet" href="<%=basePath%>/css/public/header.css">
    <link rel="stylesheet" href="<%=basePath%>/css/login_formStyle.css">
</head>
<body>
<div id="page2"></div>
<div class="bg">
    <script> $(".bg").load("/nyg/html/public/header.html");</script>
</div>
<div class="content">
    <div class="main clear-float">
        <c:if test="${items!=null&&items.size()>0}">
            <c:forEach var="item" items="${items}">
            <div class="item">
                <a href="<%=basePath%>/item/item?id=${item.productId}"></a>
                <div class="item-top">
                    <img src="<%=ip_port%>${item.productPicInfo.picUrl}" alt="">
                </div>
                <div class="item-Details">
                    <p class="item-price">${item.price}</p>
                    <h5 class="item-name">${item.productName}</h5>
                    <p class="item-router">发货地:辽宁本溪</p>
                </div>
            </div>
            </c:forEach>
        </c:if>
    </div>
</div>
<script src="<c:url value="/js/jquery-1.12.4.js"/>"></script>
<script src="<%=basePath%>/js/item-js.js"></script>
<script>
    var $searchButton = $(".search-button");
    var $searchName = $(".search-text-model");
    $searchButton.on("click",function () {
        var value = $searchName.val();
        if (value!=null&&value!==""){
            location.href="/nyg/items/1?productName="+value;
        }
    })
</script>
<script>
    $("#page2").load("/nyg/html/login_form.html");
</script>
<script src="<%=basePath%>/js/login_form.js"></script>
</body>
</html>
