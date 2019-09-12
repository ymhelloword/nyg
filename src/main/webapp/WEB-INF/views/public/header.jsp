<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/9/2
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/css/public/header.css"%>">
</head>
<body>
<div class="header-top">
    <div class="top-nav-content">
        <div class="top-title">
            <p>欢迎来到农优购
                <span>
                </span>
            </p>
        </div>
        <div class="top-ul">
            <ul>
                <li><span><a href="javascript:;">网站首页</a></span></li>
                <li><span><a href="javascript:;">扶贫项目</a></span></li>
                <li><span><a href="javascript:;">关于我们</a></span></li>
                <li><span><a href="javascript:;">帮助中心</a></span></li>
                <li class="shopping-cart">
                            <span>
                                <a href="javascript:;" >购物车</a>
                                <svg class="icon" aria-hidden="true" style="vertical-align: middle ;padding: 0">
                                    <use xlink:href="#icongouwuche"></use>
                                </svg>
                            </span>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="header-content">
    <div class="search-bg">
        <div class="log">
            <div class="log-img">
                <h1><a href="javascript:;"><img src="/nyg/img/logo.jpg" alt=""></a></h1>
            </div>
            <!--<div class="log-art-font">
                <h1><a href="javascript:;"><img src="" alt=""></a></h1>
            </div>-->
        </div>
        <div class="search">
            <div class="search-select">
                <div id="search-id">
                    <span></span>
                </div>
            </div>
            <div class="search-text">
                <input type="text" placeholder="请输入关键字" class="search-text-model">
            </div>
            <div class="search-button">
                <span>搜索</span>
            </div>
        </div>
    </div>
</div>
<div class="nav-bg">
    <div class="nav-bg-content">
        <ul>
            <li id="index-header"><a href="/nyg/" >首页</a></li>
            <li><a href="/nyg/supply/1">供应大厅</a></li>
            <li id="purchase-header"><a href="/nyg/purchase" rel="">采购大厅</a></li>
            <li><a href="javascript:;">扶贫信息</a></li>
            <li><a href="javascript:;">产业带</a></li>
            <li><a href="javascript:;">信息中心</a></li>
        </ul>
    </div>
</div>
</body>
</html>
