$(function () {
    $(".shopping-cart").on("click",function () {
        $.ajax({
            url:'/nyg/checkLogin',
            type:"post",
            dataType:"json",
            success:function (data) {
                if(data==0){
                    $(".alert").show();
                    $("#login").on("click",function () {
                        var account = $("#account").val();
                        var password = $("#pwd").val();
                        $.ajax({
                            url:"/nyg/login",
                            type:"post",
                            dataType:"json",
                            data:{"loginName":account,"password":password},
                            success:function (data) {
                                if (data.msg === 1){
                                    $(".alert").hide();
                                    window.location.href="/nyg/orderCart";
                                }else {
                                    $("#error").show();
                                }
                            }
                        })
                    });
                    $("#cancel").on("click",function () {
                        $(".alert").hide();
                    })
                }else {
                    window.location.href="/nyg/orderCart";
                }
            }

        })
    })
})

