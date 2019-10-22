<%--
  Created by IntelliJ IDEA.
  User: zjl
  Date: 2019/10/15
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            var url = window.location.href.toString();
            console.log(url.match(/^\w*vegetable*$/))
            console.log(/^\w*vegetable*$/.test(url))
            if(url.match(/^\w*vegetable*$/)){
                $("#vegetable").css({background:"#7AE284"})
            }
        })
    </script>
</head>
<body>
<div class="recommend">
    <ul>
        <li class="popular">热门推荐</li>
        <li>
            <a href="/nyg/supply/vegetable/baicai" value="1">白菜</a>
            <a href="/nyg/supply/vegetable/bocai" value="2">菠菜</a>
            <a href="/nyg/supply/vegetable/youcai" value="3">油菜</a>
            <a href="/nyg/supply/vegetable/juanxincai" value="4">卷心菜</a>
            <a href="/nyg/supply/vegetable/jiucai" value="5">韭菜</a>
            <a href="/nyg/supply/vegetable/xiangcai" value="6">香菜</a>
            <a href="/nyg/supply/vegetable/qincai" value="7">芥菜</a>
            <a href="/nyg/supply/vegetable/shuanmiao" value="8">蒜苗</a>
            <a href="/nyg/supply/vegetable/shencai" value="9">生菜</a>
            <a href="/nyg/supply/vegetable/ganlan" value="10">甘蓝</a>
        </li>
        <li>
            <a href="/nyg/supply/vegetable/xiaocong" value="11">小葱</a>
            <a href="/nyg/supply/vegetable/luobu" value="12">萝卜</a>
            <a href="/nyg/supply/vegetable/malingshu" value="13">马铃薯</a>
            <a href="/nyg/supply/vegetable/shenjiang" value="14">生姜</a>
            <a href="/nyg/supply/vegetable/dashuan" value="15">大蒜</a>
            <a href="/nyg/supply/vegetable/nangua" value="16">南瓜</a>
            <a href="/nyg/supply/vegetable/donggua" value="17">冬瓜</a>
            <a href="/nyg/supply/vegetable/sigua" value="18">丝瓜</a>
            <a href="/nyg/supply/vegetable/huangua" value="19">黄瓜</a>
            <a href="/nyg/supply/vegetable/xihongshi" value="20">西红柿</a>
        </li>
        <li>
            <a href="/nyg/supply/vegetable/yumi" value="21">玉米</a>
            <a href="/nyg/supply/vegetable/maodou" value="22">毛豆</a>
            <a href="/nyg/supply/vegetable/wandou" value="23">豌豆</a>
            <a href="/nyg/supply/vegetable/candou" value="24">蚕豆</a>
            <a href="/nyg/supply/vegetable/qiezi" value="25">茄子</a>
            <a href="/nyg/supply/vegetable/lajiao" value="26">辣椒</a>
            <a href="/nyg/supply/vegetable/jiangdou" value="27">豇豆</a>
            <a href="/nyg/supply/vegetable/sijidou" value="28">四季豆</a>
            <a href="/nyg/supply/vegetable/xianggu" value="29">香菇</a>
            <a href="/nyg/supply/vegetable/pingu" value="30">平菇</a>
            <a href="/nyg/supply/vegetable/jinzhengu" value="31">金针菇</a>
            <a href="/nyg/supply/vegetable/muer" value="32">木耳</a>
        </li>
    </ul>
</div>
</body>
</html>
