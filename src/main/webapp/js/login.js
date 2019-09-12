$(function () {
    var $account = $("#account");
    var $pwd = $("#pwd");
    $account.on("blur",function () {
        var account = $account.val();
        var Regular = /^([a-zA-Z0-9]){6,12}$/;
        if(Regular.test(account)){
            $account.css({borderColor:""})
        }else {
            $account.css({borderColor:"red"});
        }
    });
    $pwd.on("blur",function () {
        var account = $account.val();
        var Regular = /^([a-zA-Z0-9]){6,12}$/;
        if(Regular.test(account)){
            $account.css({borderColor:""})
        }else {
            $account.css({borderColor:"red"});
        }
    });
    $(".login-submit").click(function () {
        var account = $account.val();
        var pwd = $pwd.val();
        if ($account.val()!=null&&$pwd.val()!=null){
            $.ajax({
                url:"/nyg/login",
                type:"post",
                dataType:"json",
                data:{"loginName":account,"password":pwd},
                success:function (data) {
                    if (data.msg===1){
                        $.cookie("loginName",data.loginName,60*60*24*3);
                        $.cookie("password",data.password,60*60*24*3);
                        console.log(data.loginName+"________-"+data.password);
                        window.location.href="/nyg/index"
                    } else {
                        alert("密码或者是账号不对，请检查！并重新输入！")
                    }
                }
            })
        }
    });
});