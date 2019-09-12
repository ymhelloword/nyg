<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/5/27
  Time: 21:28
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
    <link rel="stylesheet" href="<%=basePath%>/css/gongyingstyle.css">
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="<%=basePath%>/js/login_form.js" type="text/javascript"></script>
    <script src="<%=basePath%>/js/gongying.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/css/public/header.css">
    <link rel="stylesheet" href="<%=basePath%>/css/login_formStyle.css">
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
<div id="page2"></div>
<div class="bg">
    <%@include file="public/header.jsp"%>
</div>
<div  class="basewidth">
    <div  class="bread clear-float">
        <div  data-v-01ecb170="" class="bread_left">
            <img src="<%=ip_port%>${productInfo.productPicInfo.picUrl}" alt="" style="width: 460px;">
        </div>
        <div  class="bread_right">
            <div  class="proinfo-text">
                <div class="proinfo-title fs16 black3">${productInfo.productName}</div>
                <div class="priceTxt">
                    <span class="fs14 gray6 info-left margin-bottom">价格</span>
                    <p class="orange price"><span class="fs12">￥</span>
                        <span class="fs30" id="price">${productInfo.price}</span> <!----></p>
                    <p class="fs12 gray6 text">* 参考价中不包含运费，交易前请先使用"立即电话聊"和卖家沟通，确认好运输方式和运费。</p>
                </div>
                <div class="txt">
                    <span class="info-left fs14 gray6">货源地</span>
                    <span class="fs14 gray6">重庆重庆市酉阳土家族苗族自治县</span>
                </div>
                <div class="txt">
                    <span class="info-left fs14 gray6">包装规格</span>
                    <ul class="eye-renderer eye-clear spec">
                        <li class="eye-renderer__select eye-renderer__float" style="width: 25%;"><!----> <span>${productInfo.productName}</span></li>
                    </ul>
                </div>
                <div class="number" unselectable="on" style="-moz-user-select:none;" onselectstart="return false;">
                    <span style="margin-right: 20px;font-size: 18px ">购买数量</span>
                    <a class="less" ></a>
                    <input type="text" class="buy-number" name="number" id="productAmount" value="1">
                    <a class="add"></a>
                </div>
                <div class="shopping ">
                    <span class="shopping-cart-1">加入购物车</span>
                    <span class="buy">立即购买</span>
                </div>
                <div class="fs12 gray3f bottom-text">
                    <p>
                        <span class="orange">* </span>了解农产品更多详细信息，和商家电话洽谈生意，<span class="orange">请点击打电话聊。</span>
                    </p>
                    <span class="orange">* </span>不发货等不诚信行为。立即点此<span></span> <a href="http://www.cnhnb.com/app/download/" class="orange">【下载农优购APP】</a>
                </div>
                <div class="dialog" style="display: none;"><div data-v-3a542f51="" class="dialog-container">
                    <div  class="dialog-title">联系商家<span data-v-3a542f51="" class="close-btn">×</span></div> <div data-v-3a542f51="" class="content">联系商家请拨打转接号码惠农网帮您转接</div>
                    <div  class="remark">*重点提示：拨打的手机号码必须和登录的手机号码一致</div> <!----> <!---->
                </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer-bg">
    <div class="footer-button">
        <div  class="bt-content">
            <div  class="bt-ul-content clear-float">
                <ul class="">
                    <li ><a href="javascript:;" target="_blank">关于我们</a></li>
                    <li ><a href="javascript:;" target="_blank" rel="nofollow">法律声明</a></li>
                    <li ><a href="javascript:;" target="_blank" rel="nofollow">使用协议</a></li>
                    <li ><a href="javascript:;" target="_blank" rel="nofollow">版权隐私</a></li>
                    <li ><a href="javascript:;" target="_blank" rel="nofollow">友情链接</a></li>
                    <li ><a href="javascript:;" target="_blank" rel="nofollow">成功案例</a></li>
                    <li ><a href="javascript:;" target="_blank">产品库</a></li>
                    <li ><a href="javascript:;" target="_blank">品种库</a></li>
                    <li ><a href="javascript:;" target="_blank">产品价格大全</a></li>
                </ul>
            </div>
            <div  class="bt-p">
                <p >
                    <a  href="javascript:;" target="_blank" rel="nofollow">湘ICP备13007354号-1 </a>
                    <span  class="font">|</span>服务热线：400-008-8688</p>
                <p >互联网药品信息服务资格证书:(湘)-经营性-2014-0005 湖南惠农科技有限公司 <a href="javascript:;" target="_blank" rel="nofollow">营业执照号</a></p>
                <p>©-2019 Cnhnb B2B SYSTEM All Rights Reserved</p>
            </div>
        </div>
    </div>
</div>
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
</body>
</html>

