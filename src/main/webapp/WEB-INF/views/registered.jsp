<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/5/27
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String appleContext = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+appleContext;
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册账号</title>
    <link href="https://cdn.bootcss.com/normalize/8.0.1/normalize.css" rel="stylesheet">
    <link rel="stylesheet" href="<%=basePath%>/plugin/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>/css/registered.css">
    <script src="<%=basePath%>/js/jquery-1.12.4.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="<%=basePath%>/plugin/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>/js/registered.js"></script>
</head>
<body>
<div class="header">
    <div class="">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
            <a href="#" class="navbar-brand">农优购</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href="<%=basePath%>\index" class="nav-link">首页</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">供应大厅</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">采购大厅</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">扶贫信息</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">信息中心</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <hr>
</div>
<div class="content">
    <div class="container">
                <form action="" class="row">
        <div class="row">
            <div class="col-8  login">
                    <div class="form-group row col-12">
                        <label for="account" class="col-3  col-form-label text-right"><i class="glyphicon glyphicon-user"></i>账号:</label>
                        <div class="col-9 ">
                            <input type="text" id="account" name="loginName" class=" form-control">
                            <p class="help-block"><span class="accountErr" style="color: #ff5a35"></span><small>输入6-12的字符(数字,英文字符)</small></p>
                        </div>
                    </div>
                    <div class="form-group row col-12">
                        <label for="password" class="col-3 col-form-label text-right"><i class="glyphicon glyphicon-lock"></i>密码:</label>
                        <div class="col-9  ">
                            <input type="password" id="password" name="password" class=" form-control">
                            <p class="help-block"><span class="passwordErr" style="color: #ff013d"></span><small>输入6-14位的密码</small></p>
                        </div>
                    </div>
                    <div class="form-group row col-12">
                        <label for="confirm" class="col-3 col-form-label text-right"><i class="glyphicon glyphicon-"></i>确认密码:</label>
                        <div class="col-9">
                            <input type="password" id="confirm"  class=" form-control">
                            <span class="confirmPwd" style="color: red"></span>
                        </div>
                    </div>
                    <div class="form-group row col-12 ">
                        <div class="offset-4 offset-xl-3">
                            <input id="registered" class="btn btn-success control-label" value="立即注册"></input>
                            <input type="reset" class="btn btn-danger control-label" value="重置"></input>
                        </div>
                    </div>
            </div>
            <div class="img col-4" style="text-align: center">
                <p>上传头像</p>
                <input type="file" id="file" name="file">
            </div>
        </div>
        </form>
    </div>
</div>
</body>
</html>