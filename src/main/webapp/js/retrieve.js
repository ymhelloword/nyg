$(function () {
    $getCode = $("#getCode");
    $phoneNumber = $("#phone_number");
    $pwd = $("#pwd");
    $submit = $("#submit");
    $pwd_confirm = $("#pwd_confirm");
    $code = $("#code");
    $getCode.on("click",function () {
        var phoneNumber = $phoneNumber.val();
        if (phoneNumber !== null){
            if (/^\d{11}$/g.test(phoneNumber)){
             $getCode.attr("disabled","true");
             $(this).after("<span></span>")
             $.ajax({
                 url:'',
                 type:'post',
                 data:'',
                 success:function () {

                 }
             })

            }else{
                alert("您输入的手机号格式不对，请检查！")
            }
        }else {
            alert("手机号码不能为空！")
        }
    })
    $submit.on("click",function () {
        var phoneNumber  = $phoneNumber.val();
        var pwd = $pwd.val();
        var pwd_confirm = $pwd_confirm.val();
        var code = $code.val();
        if (''===phoneNumber||''===pwd||''===pwd_confirm||''===code) alert("输入内容不对！请重新输入。");
        if (/^\d{11}$/.test(phoneNumber)){
            if (/^[a-zA-Z0-9]{6,14}([.]{0,2})$/.test(pwd)){
                if (pwd===pwd_confirm){
                    if (/^\d{5}$/.test(code)){
                  $.ajax({
                            url:'',
                            type:'',
                            data:'',
                            success:function () {

                            }
                        })
                    }else {
                        alert("验证正码不对");
                    }
                }else {
                    alert("输入的两次密码不相同")
                }
            }else {
                alert("密码格式不对")
            }
        }else{
            alert("手机格式不对！")
        }

        // if (pwd == null) alert("密码不能为空！");
    })
    $pwd.on("blur",function () {
        if (/^[a-zA-Z0-9]{6,14}([.]{0,2})$/.test(pwd)){

        }else {
            alert("密码格式不对！");
        }
    })
    $pwd_confirm.on("blur",function () {
        var pwd = $pwd.val();
        var pwd_confirm = $pwd_confirm.val();
        if (pwd_confirm !== pwd){
            alert("输入的密码不相同")
        }
    })
})