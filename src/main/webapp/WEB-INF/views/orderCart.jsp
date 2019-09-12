<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/8/12
  Time: 8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String appContext= request.getContextPath();//  获取当前应用的根路径构建当前应用的绝对路径（/appName）
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + appContext ;
    // 将basePath存入pageContext中，将来用EL表达式读取
    pageContext.setAttribute("basePath",basePath);
    String ip_port = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/css/shopping.css">
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="<%=basePath%>/js/orderCat.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/css/public/header.css">
    <link rel="stylesheet" href="<%=basePath%>/fonts/iconfont.css">
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
</head>
<body>
<div class="bg">
   <%@include file="public/header.jsp"%>
</div>
<div class="content">

    <div class="tab-car" style="width: 1200px">
        <table style="width: 1200px;border-collapse: collapse" class="items">
            <tr style="height: 50px;line-height: 50px">
                <td style="width:200px">
                    <input type="checkbox" id="select-all">
                    <label for="select-all">全选</label>
                </td>
                <td style="width: 38%">商品</td>
                <td style="width: 12%">单位(元)</td>
                <td style="width: 15%" align="center">数量</td>
                <td style="width: 12%">小计(元)</td>
                <td style="width: 11%">操作</td>
            </tr>
        </table>
        <table class="store">
            <thead>
            </thead>
            <tbody>
            <c:if test="${orderCart!=null}">
            <c:forEach items="${orderCart}" var="order" varStatus="i">
                <tr value="${order.productId}">
                    <td style="width:200px">
                        <input type="checkbox" style="vertical-align: top;height: 80px">
                        <span><img src="<%=ip_port%>${products.get(i.index).productPicInfo.picUrl}" alt="" width="78px" height="78px"></span>
                    </td>
                    <td style="width: 38%"><a href="" class="item-name">${products.get(i.index).productName}</a></td>
                    <td style="width: 12%">￥${products.get(i.index).price}</td>
                    <td style="width: 15%" align="center">
                        <div>
                            <a href="javascript:;" class="less">-</a>
                            <input type="text" class="productAmount" style="width:40px;height: 21px;vertical-align: top" value="${order.productAmount}">
                            <a href="javascript:;" class="add">-</a>
                        </div>
                    </td>
                    <td style="width: 12%">￥${order.price}</td>
                    <td style="width: 11%">
                        <div>
                        <a href="javascript:;" class="buy">购买</a>
                        <a href="javascript:;" class="deleted">删除</a>
                        </div>
                    </td>
                </tr>
            </c:forEach>

            </c:if>
            </tbody>
        </table>
        <c:if test="${orderCart==null}">
            <h3>购物车没有商品！</h3>
        </c:if>
    </div>

</div>
</body>
</html>
