$(function () {
    var $account = $("#account");
    var $password = $("#password");
    var $confirm = $("#confirm");
    var timer ;
    $account.focus(function () {
        var Regular = /^(\d+){11}$/;
        timer = setInterval(function () {
            var value = $account.val();
            if (Regular.test(value)){
                $account.css({border:"2px solid green"})
                $(".accountErr").text("");
            }else {
                if (value.length>=4){
                    $account.css({border:"2px solid #FF5A35"})
                }
            }
        },600)
    });
    $account.blur(function () {
        var value = $account.val();
        var Regular = /^(\d+){11}$/;
        if (Regular.test(value)){
            $account.css({border:"none"})
            $(".accountErr").text("");
            //    输入框失去焦点时校验账号是否已被注册
            $.ajax({
                url:"/nyg/signup/check",
                type:"post",
                dataType:"json",
                data:{"account":$account.val()},
                success:function (data) {
                    console.log(data.msg);
                    if (data.msg===0){
                        $account.css({border:"2px solid green"});
                    } else {
                        $account.css({border:"2px solid red"});
                        $(".accountErr").text("该账号已被注册!");
                        setTimeout(function () {
                            $account.val("");
                        },2000)
                    }
                }

            })
        } else {
            $account.css({border:"2px solid red"});
            $(".accountErr").text("输入错误");
        }
        clearInterval(timer);

    });
    $password.focus(function () {
        var Regular = /^([a-zA-Z0-9]){6,12}$/;
        timer = setInterval(function () {
            var value = $password.val();
            if (Regular.test(value)){
                $password.css({border:"2px solid green"});
                $(".passwordErr").text("");
            }else {
                if (value.length>=4){
                    $password.css({border:"2px solid #FF5A35"})
                }
            }
        },300)
    });
    $password.blur(function () {
        var value = $password.val();
        var Regular = /^([a-zA-Z0-9]){6,12}$/;
        if (Regular.test(value)){
            $password.css({border:"none"});
            $(".passwordErr").text("");
        } else {
            $password.css({border:"2px solid red"});
            $(".passwordErr").text("输入错误");
        }
        clearInterval(timer);
    });
    $confirm.blur(function () {
        var confirmPsw = $confirm.val();
        if (confirmPsw!==$password.val()){
            $confirm.css({border:"2px solid red"});
            $(".confirmPwd").text("密码不一致");
        }else {
            $confirm.css({border:"none"});
            $(".confirmPwd").text("");
        }
    });
    $("#registered").on("click",function () {
        if (/^([a-zA-Z0-9]){6,12}$/.test($account.val())&&/^([a-zA-Z0-9]){6,14}$/.test($password.val())&&$password.val()===$confirm.val()){
            var info = new FormData($("form")[0]);
            $.ajax({
                url:"/nyg/signup/registered",
                type:"post",
                dataType:"json",
                data:info,
                processData: false,
                contentType: false,
                success:function (data) {
                    if (data==1){
                        alert("注册成功");
                        window.location.href="/nyg/";
                    } else {
                        alert("注册失败。请重试一下！")
                    }
                }
            })
        } else {
            alert("输入信息错误，请重新输入！");
            return false;
        }

    });
    $("#getCode").on("click",function (event) {
        event.preventDefault();
        var telephone = $account.val();
        if (telephone === ''){
            alert("手机号码不能为空");
            return;
        }
        var $getCode = $(this);
        $getCode.attr("disabled","disabled")
       var $template = $("<span>&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"second\">60</span>秒后重试</span>");
        $template.insertAfter($getCode);
        var $second = $(".second");
        var second = 60;
        function del() {
            if (second === 0){
                second = 60;
                clearInterval(a);
               $getCode.removeAttr("disabled");
               $template.remove();
                return;
            }else {
                second --;
                $second.text(second);
            }
        }
        var  a = setInterval(function () {
                del();
        },1000);
        $.ajax({
            url:"/nyg/signup/getVerCode",
            type:"get",
            data:{telephone:telephone},
            success:function (data) {
                alert(data);
            }
        })
    })

});