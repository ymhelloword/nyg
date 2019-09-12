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
    <script src="<%=basePath%>/js/purchase.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/fonts/iconfont.css">
    <link rel="stylesheet" href="<%=basePath%>/css/public/header.css">
    <link rel="stylesheet" href="<%=basePath%>/css/public/classification.css">
    <link rel="stylesheet" href="<%=basePath%>/css/purchase.css">
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
    <div class="purchase">
        <div class="purchase-table">
            <div class="header">
                <ul>
                    <li>采购品种</li>
                    <li>采购数量</li>
                    <li>期望货源地</li>
                    <li>发布人</li>
                    <li>认证情况</li>
                </ul>
            </div>
            <div class="content ">
                <div class="purchases ">
                    <c:forEach var="purchase" items="${purchases}">
                        <a href=""  id="purchase">
                            <div class="info">
                                <ul>
                                    <li class="variety">${purchase.productName}</li>
                                    <li class="number">${purchase.productQuantity}</li>
                                    <li class="place">${purchase.placeOfOrgin}</li>
                                    <li class="publisher">张三</li>
                                    <li class="certification"></li>
                                    <li class="details">查看详情</li>
                                </ul>
                            </div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </div>
        <%@include file="public/page.jsp"%>
    </div>
</div>
<div class="footer">
    <div class="footer-header">
        <div class="link">
            <ul>
                <li>友情链接：</li>
                <li><a href="">农优购</a></li>
                <li><a href=""></a></li>
                <li><a href=""></a></li>
                <li><a href=""></a></li>
                <li><a href=""></a></li>
            </ul>
        </div>
    </div>
    <div class="footer-help-bg">
        <div class="footer-bg">
            <div class="bt-content-top">
                <div class="fixed-btn">
                    <a href="javascript:void(0)" class="go-top"><i class="layui-icon layui-icon-up"></i></a>
                    <a href="javascript:void(0)" class="qrcode"></a>
                </div>
                <ul>
                    <li>
                        <div class="help-text-div">
                            <ul class="help-text-ul">
                                <li >使用指南</li>
                                <li >
                                    <a  href="javascript:;" target="" rel="nofollow">注册新用户</a>
                                </li>
                                <li >
                                    <a href="javascript:;" target="" rel="nofollow">实名认证</a>
                                </li>
                                <li ><a href="javascript:;" target="" rel="nofollow">找回密码</a>
                                </li>
                                <li ><a href="javascript:;" target="" rel="nofollow">帮助中心</a></li>
                                <li ><a href="javascript:;" target="" rel="nofollow">安装农优购 APP</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <div class="help-text-div">
                            <ul class="help-text-ul">
                                <li>采购商服务</li>
                                <li><a href="javascript:;" target="">找供应</a></li>
                                <li ><a  href="javascript:;" target="" rel="nofollow">发布采购</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <div class="help-text-div">
                            <ul class="help-text-ul">
                                <li >交易安全</li>
                                <li ><a  href="javascript:;" target="" rel="nofollow">卖家防骗</a></li>
                                <li ><a  href="javascript:;" target="">营销推广</a></li>
                                <li ><a  href="javascript:;" target="" rel="nofollow">买家防骗</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
                <div class="app">微信二维码</div>
                <div class="wx-QR">APP下载码</div>
            </div>
            <div class="footer-button">
                <div data-v-9741756e="" class="bt-content">
                    <div data-v-9741756e="" class="bt-ul-content">
                        <ul data-v-9741756e="">
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank">关于我们</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">法律声明</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">使用协议</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">版权隐私</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">友情链接</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">成功案例</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank">产品库</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank">品种库</a></li>
                            <li data-v-9741756e=""><a data-v-9741756e="" href="javascript:;" target="_blank">产品价格大全</a></li>
                        </ul>
                    </div>
                    <div data-v-9741756e="" class="bt-p">
                        <p data-v-9741756e="">
                            <a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">湘ICP备13007354号-1 </a>
                            <span data-v-9741756e="" class="font">|</span>服务热线：400-008-8688</p>
                        <p data-v-9741756e="">互联网药品信息服务资格证书:(湘)-经营性-2014-0005 湖南惠农科技有限公司 <a data-v-9741756e="" href="javascript:;" target="_blank" rel="nofollow">营业执照号</a></p>
                        <p data-v-9741756e="">©-2019 Cnhnb B2B SYSTEM All Rights Reserved</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $("#page2").load("/nyg/html/login_form.html");
</script>
</body>
</html>
