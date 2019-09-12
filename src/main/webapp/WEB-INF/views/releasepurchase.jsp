<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%
    String appContext= request.getContextPath();//  获取当前应用的根路径构建当前应用的绝对路径（/appName）
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + appContext ;
    // 将basePath存入pageContext中，将来用EL表达式读取
    pageContext.setAttribute("basePath",basePath);
    String ip_port = request.getScheme()+"://"+"47.102.151.46";
    String account = ( String ) request.getSession().getAttribute("account");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="<%=basePath%>/js/login_form.js" type="text/javascript"></script>
    <script src="<%=basePath%>/js/jquery.cookie.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/fonts/iconfont.css">
    <link rel="stylesheet" href="<%=basePath%>/css/public/header.css">
    <link rel="stylesheet" href="<%=basePath%>/css/public/classification.css">
    <link rel="stylesheet" href="<%=basePath%>/css/release.css">
    <script src="<%=basePath%>/js/release.js" type="text/javascript"></script>
    <style>
        .icon {
            width: 2em;
            height: 1.5em;
            box-sizing: border-box;
            padding-top: 5px;
            vertical-align: -0.15em;
            fill: currentColor;
            overflow: hidden;
        }
        .icon-lg {
            width: 1.5em;
            height: 2em;
            box-sizing: border-box;
            padding-top: 5px;
            vertical-align: -0.15em;
            fill: currentColor;
            overflow: hidden;
        }
    </style>
    <script src="<%=basePath%>/fonts/iconfont.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/css/login_formStyle.css">

</head>
<body>
<div id="page2"></div>
<div class="bg">
    <%--<script> $(".bg").load("/nyg/html/public/header.html");</script>--%>
    <%@include file="./public/header.jsp"%>
</div>
<div class="content">
    <%@include file="public/classification.jsp"%>
    <div class="right">
        <div class="add-commodity clear-float">
            <h2 id="a">添加商品</h2>
            <div class="form clear-float">
                <form>
                    <div>
                        <label for="productName">商品名称</label>
                        <input type="text" id="productName" name="productName" placeholder="商品名称">
                    </div>
                    <div>
                        <label for="productNumber">数量</label>
                        <input type="text" id="productNumber" name="productQuantity" placeholder="商品数量">
                    </div>
                    <div>
                        <label for="price">价格</label>
                        <input type="text" id="price" name="productPrice">
                    </div>
                    <div>
                        <label for="place">期望货源地</label>
                        <input type="text" id="place" name="placeOfOrgin">
                    </div>
                    <div>
                        <input type="button" value="发布采购" id="release">
                        <input type="button" value="取消" id="cancel">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
