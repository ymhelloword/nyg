<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%
    String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    String ip_port = request.getScheme()+"://"+"47.102.151.46";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="<%=path%>/css/supply.css">
    <script src="<%=path%>/js/jquery-1.12.4.js"></script>
    <script src="<%=path%>/js/supply.js" type="text/javascript"></script>
    <script src="<%=path%>/js/public/page.js"></script>
    <link rel="stylesheet" href="<%=path%>/fonts/iconfont.css">
    <link rel="stylesheet" href="<%=path%>/css/public/page.css">
    <link rel="stylesheet" href="<%=path%>/css/public/footer.css">
    <link rel="stylesheet" href="<%=path%>/css/public/header.css">
    <link rel="stylesheet" href="<%=path%>/css/login_formStyle.css">

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
    <script src="<%=path%>/fonts/iconfont.js"></script>
</head>
<body>
<div id="page2"></div>
<div class="bg">
    <%--<script> $(".bg").load("/nyg/html/public/header.html");</script>--%>
    <%@include file="./public/header.jsp"%>
</div>
<div class="content">
    <div class="classification">
        <div class="commodity-classification clear-float">
            <ul>
                <li><a href="">全部分类</a></li>
                <li><a href="">水果</a></li>
                <li><a href="">蔬菜</a></li>
                <li><a href="">大米</a></li>
                <li><a href="">葡萄酒</a></li>
                <li><a href="">种子种苗</a></li>
                <li><a href="">中药材</a></li>
                <li><a href="">农资农机</a></li>
            </ul>
        </div>
        <div class="recommend">
            <ul>
                <li class="popular">热门推荐</li>
                <li>
                    <a href="">西瓜</a>
                    <a href="">鸡苗</a>
                    <a href="">鸡</a>
                    <a href="">葡萄</a>
                    <a href="">苹果</a>
                    <a href="">大蒜</a>
                    <a href="">李子</a>
                    <a href="">鸭苗</a>
                    <a href="">榴莲</a>
                    <a href="">水产干货</a>
                    <a href="">红薯</a>
                    <a href="">香菇</a>
                    <a href="">竹笋</a>
                    <a href="">辣椒</a>
                    <a href="">甜瓜</a>
                    <a href="">大葱</a>
                </li>
                <li>
                    <a href="">鸡蛋</a>
                    <a href="">土豆</a>
                    <a href="">芒果</a>
                    <a href="">百香果</a>
                    <a href="">鹅苗</a>
                    <a href="">大蒜</a>
                    <a href="">竹笋</a>
                    <a href="">辣椒</a>
                    <a href="">核桃</a>
                    <a href="">鲜玉米</a>
                </li>
                <li>
                    <a href="">牛肉</a>
                    <a href="">淡水螺</a>
                    <a href="">柑桔</a>
                    <a href="">鱼苗</a>
                    <a href="">黄桃</a>
                    <a href="">哈密瓜</a>
                    <a href="">香蕉</a>
                    <a href="">火龙果</a>
                    <a href="">蚂蚁</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="item clear-float">
        <ul class="hot-ul" id="hot_ul">
            <c:forEach items="${products}" var="product">
                <li>
                    <a href=<%=path%>/item/item?id=${product.productId}></a>
                    <img src="<%=ip_port%>${product.productPicInfo.picUrl}" class="hot-img">
                    <ul class="item-information">
                        <li class="commodity-name">${product.productName}</li>
                        <li class="commodity-price">${product.price}<svg class="icon" aria-hidden="true">
                            <use xlink:href="#iconjiage-copy"></use>"</svg></li>
                        <li class="commodity-source-aea">商品产地</li>
                        <li class="commodity-authentication">认证</li>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </div>
    <%@include file="public/page.jsp"%>
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
