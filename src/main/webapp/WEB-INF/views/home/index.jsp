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
    <link rel="stylesheet" href="<%=basePath%>/css/index-style.css">
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="<%=basePath%>/js/login_form.js" type="text/javascript"></script>
    <script src="<%=basePath%>/js/jquery.lazyload.js"/>
    <script src="<%=basePath%>/js/jquery.cookie.js"></script>
    <script src="<%=basePath%>/js/index.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/layui/css/layui.css">
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
    <link rel="stylesheet" href="<%=basePath%>/css/login_formStyle.css">
</head>
<body>
<div id="page2"></div>
<div class="bg">
    <%--<script> $(".bg").load("/nyg/html/public/header.html");</script>--%>
    <%@include file="../public/header.jsp"%>

</div>
<div class="first-category-bg">
    <div class="content">
        <div id="left-tab" class="left-tab">
            <div>
                <ul class="main-menu">
                    <li>
                        <div>
                            <svg class="icon-lg" aria-hidden="true">
                                <use xlink:href="#iconliangshi"></use>
                            </svg>
                            <a href="javascript:;">粮油米面</a>
                            <span class="span_i">></span>
                        </div>
                        <!--<div>-->
                        <!--<a href="javascript:;">调味品</a>-->
                        <!--<a href="javascript:;">食用油</a>-->
                        <!--</div>-->
                    </li>
                    <li>
                        <div>
                            <svg class="icon-lg" aria-hidden="true">
                                <use xlink:href="#iconicon-test"></use>
                            </svg>
                            <a href="javascript:;">生鲜水果</a>
                            <span class="span_i">></span>
                        </div>
                        <!--<div>-->
                        <!--<a href="javascript:;">葡萄类</a>-->
                        <!--<a href="javascript:;">柑橘类</a>-->
                        <!--</div>-->
                    </li>
                    <li>
                        <div>
                            <svg class="icon-lg" aria-hidden="true">
                                <use xlink:href="#iconjiuba"></use>
                            </svg>
                            <a href="javascript:;">有机葡萄酒</a>
                            <span class="span_i">></span>
                        </div>
                        <!--<div>-->
                        <!--<a href="javascript:;">葡萄酒</a>-->
                        <!--<a href="javascript:;">米酒</a>-->
                        <!--</div>-->
                    </li>
                    <li>
                        <div>
                            <svg class="icon-lg" aria-hidden="true">
                                <use xlink:href="#iconshucaishala"></use>
                            </svg>
                            <a href="javascript:;">新鲜蔬菜</a>
                            <span class="span_i">></span>
                        </div>
                        <!--<div>-->
                        <!--<a href="javascript:;">芽苗类</a>-->
                        <!--<a href="javascript:;">豆菜类</a>-->
                        <!--</div>-->
                    </li>
                </ul>
                <div class="second-menu"></div>
                <div class="second-menu"></div>
                <div class="second-menu"></div>
                <div class="second-menu"></div>
            </div>
        </div>
        <div class="chang-img">
            <div class="img-top">
                <ul>
                    <li><img src="<%=basePath%>/img/changImg/fruit.jpg" alt=""></li>
                    <li><img src="<%=basePath%>/img/changImg/timg.jpg" alt=""></li>
                    <li><img src="<%=basePath%>/img/changImg/vagetable.jpg" alt=""></li>
                    <li><img src="<%=basePath%>/img/changImg/fruit.jpg" alt=""></li>
                    <li><img src="<%=basePath%>/img/changImg/fruit.jpg" alt=""></li>
                    <li><img src="<%=basePath%>/img/changImg/timg.jpg" alt=""></li>
                </ul>
                <div class="slider-buttons">
                    <span class="bg"></span>
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <div class="to-left">
                    <span><img src="<%=basePath%>/img/changImg/as.png" alt=""></span>
                </div>
                <div class="to-right">
                    <span><img src="<%=basePath%>/img/changImg/as.png" alt=""></span>
                </div>
            </div>
            <!--<div class="img-bottom">
                <ul>
                    <li><img src="" alt=""></li>
                    <li><img src="" alt=""></li>
                    <li><img src="" alt=""></li>
                    <li><img src="" alt=""></li>
                </ul>
            </div>-->
        </div>
        <div class="right-login">
            <div>
                <div class="head_portrait">
                    <img src="<%=basePath%>/img/noLogin.039bce8e.png" height="48" width="48"/>
                </div>
                <div class="login-right">
                    <c:if test="${not empty sessionScope.get('account')}">
                        <span>HI，您好${sessionScope.get('account')}</span>
                    </c:if>
                    <c:if test="${empty sessionScope.get('account')}">
                        <span>HI，您好</span>
                    </c:if>
                    <div class="sm-login" id="register"><a href="/nyg/login">免费注册登录</a></div>
                </div>
            </div>
            <div>下载农优购APP</div>
            <div class="index-fruit-notice">
                <div class="top-notice-title"><span>资讯</span></div>
                <div class="top-none_text"></div>
            </div>
        </div>
    </div>
</div>
<div class="the-new-bg">
    <div class="new-bg">
        <div class="latest-supply">
            <div class="latest-top">
                <div>最新供应</div>
                <span>实时掌握最新供应</span>
            </div>
            <div class="latest-buttom">
                <div class="latest-supply-centers">
                    <c:forEach var="product" items="${newProducts}">
                        <div class="newest-supply">
                            <a href="<%=basePath%>/item/item?id=${product.productId}">
                                <div class="img">
                                    <img src="<%=ip_port%>${product.productPicInfo.picUrl}" alt="">
                                </div>
                                <div class="info">
                                    <div class="item-name">
                                        <span>${product.productName}</span>
                                    </div>
                                    <div class="price">
                                        <span>${product.price}元/斤</span>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="latest-supply-top">
            <div class="latest-top">
                <div>最新采购</div>
                <span>实时掌握采购信息</span>
            </div>
            <div class="newest-purchase-content">
                <c:forEach items="${releases}" var="release">
                    <a href="">
                        <div class="latest-purchase-item">
                            <div class="left">
                                <div class="name">${release.productName}</div>
                                <span>期望货源地：<span>${release.placeOfOrgin}</span></span>
                            </div>
                            <div class="right"></div>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
        <div class="origin-quotation">
            <div class="latest-top">
                <div>最新行情</div>
                <span>实时掌握行情信息</span>
            </div>
        </div>
    </div>
</div>
<div class="hot-recommend-bg">
    <div class="hr-bg">
        <div class="hr-title">
            <span>热门推荐</span>
            <span>精选好货</span>
        </div>
        <div class="hot-fruit-rm">
            <div>
                <h3>粮油米面</h3>
                <ul class="hot-ul" id="hot_ul">
                    <c:forEach var="productInfo" varStatus="index" items="${productInfos}" begin="0" end="9">
                        <li>
                            <a href="<%=basePath%>/item/item?id=${productInfo.productId}"></a>
                            <div class="img-1">
                                <img width="222" height="200" data-original="<%=ip_port%>${productInfo.productPicInfo.picUrl}" alt="" class="hot-img">
                            </div>
                            <ul class="item-information">
                                <li class="commodity-name">${productInfo.productName}</li>
                                <li class="commodity-price">${productInfo.price}</li>
                                <li class="commodity-source-area">商品产地</li>
                                <li class="commodity-authentication">认证</li>
                            </ul>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div>
                <h3>水果</h3>
                <ul class="hot-ul">
                    <c:forEach var="productInfo" varStatus="index" items="${productInfos}" begin="10" end="19">
                        <li>
                            <a href="<%=basePath%>/item/item?id=${productInfo.productId}"></a>
                            <div class="img-1">
                                <img width="222" height="200" data-original="<%=ip_port%>${productInfo.productPicInfo.picUrl}" alt="" class="hot-img">
                            </div>
                            <ul class="item-information">
                                <li class="commodity-name">${productInfo.productName}</li>
                                <li class="commodity-price">${productInfo.price}</li>
                                <li class="commodity-source-area">商品产地</li>
                                <li class="commodity-authentication">认证</li>
                            </ul>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div>
                <h3>蔬菜</h3>
                <ul class="hot-ul">
                    <c:forEach var="productInfo" varStatus="index" items="${productInfos}" begin="20" end="29">
                        <li>
                            <a href="<%=basePath%>/item/item?id=${productInfo.productId}"></a>
                            <div class="img-1">
                                <img width="222" height="200" data-original="<%=ip_port%>${productInfo.productPicInfo.picUrl}" alt="" class="hot-img">
                            </div>
                            <ul class="item-information">
                                <li class="commodity-name">${productInfo.productName}</li>
                                <li class="commodity-price">${productInfo.price}</li>
                                <li class="commodity-source-area">商品产地</li>
                                <li class="commodity-authentication">认证</li>
                            </ul>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="Information-section">
    <div class="hot-consultation-bg">
        <div class="hot-ct-title">
            <span >资讯专区</span>
            <span >实时更新三农政策、行情解读、致富经、农技知识等热门资讯</span>
        </div>
    </div>
    <div class="success-case"></div>
</div>
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
<script>
    $("#page2").load("/nyg/html/login_form.html");
</script>
</body>
</html>
