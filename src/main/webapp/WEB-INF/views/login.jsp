<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/5/27
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String appContext = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+appContext;
    pageContext.setAttribute("basePath",basePath);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/css/login-style.css">
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="<%=basePath%>/js/jquery.cookie.js"></script>
    <script src="<%=basePath%>/js/login.js"></script>
</head>
<body>
<div class="header-top">
    <div class="top-nav-content">
        <div class="top-title">
            <p>欢迎来到农优购<span><a href="">请登录</a></span></p>
        </div>
        <div class="top-ul">
            <ul>
                <li><span><a href="javascript:;">网站首页</a></span></li>
                <li><span><a href="javascript:;">扶贫项目</a></span></li>
                <li><span><a href="javascript:;">关于我们</a></span></li>
                <li><span><a href="javascript:;">帮助中心</a></span></li>
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
        </div>
    </div>
</div>
<div class="hn-login">
    <div class="login-content-info">
        <div  class="title">账户登录</div>
        <div class="login-modern">
            <div class="item account">
                <i class="icon login-user-icon"></i>
                <input type="text" id="account" name="loginName" placeholder="用户账号">
            </div>
            <div class="item password">
                <i class="icon login-user-icon"></i>
                <input type="password" id="pwd" name="password" placeholder="用户密码">
            </div>
            <div class="retrieve-password">
                <a href="">忘记密码</a>
            </div>
            <div class="item button-item">
                <button type="submit" class="login-submit isShowBgColor">登 录</button>
            </div>
        </div>
        <div class="register">
            <span></span><a href="<%=basePath%>/enrol">立即注册</a>
        </div>
    </div>
    <div class="login-background">
        <img src="" alt="">
    </div>
</div>
<div class="footer-bg">
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
</body>
</html>

