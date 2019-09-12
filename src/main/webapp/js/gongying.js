$(function () {
    $(".buy-number").blur(function () {
        var value = this.value;
        var re = /^\d+$/g;
        if (!re.test(value)){
          $(".buy-number").val(1)
        }
    });
    $(".less").on("click",function () {
        var value = $(".buy-number").val();
        if (value<=1){
           return;
        }else {
            $(".buy-number").val(value-1);
        }
    })
    $(".add").on("click",function () {
        var value = parseInt($(".buy-number").val());
        if (value<1){
            return;
        }else {
            $(".buy-number").val(value+1);
        }
    })
    $(".shopping-cart-1").on("click",function () {
        var productAmount = $("#productAmount").val();
        var price = $("#price").text();
        var itemId = window.location.toString().split('?')[1].split('=')[1];
        var status = 0;
        $.ajax({
            url:'/nyg/checkLogin',
            type:"post",
            dataType:"json",
            success:function (data) {
                if (data==1) {
                    $.ajax({
                        url: "/nyg/joinShopping",
                        type: "post",
                        dataType: "json",
                        data: {"productAmount": productAmount, "price": price, "productId": itemId},
                        success: function (data) {
                            if (data==2){
                                alert("购物车中已存在该商品！")
                            }
                            if (data==1){
                                alert("添加成功！")
                            }
                            if(data==0){
                                alert("发生错误，请重试一下！")
                            }
                        }
                    })
                }else{
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
                                    $.ajax({
                                        url: "/nyg/joinShopping",
                                        type: "post",
                                        dataType: "json",
                                        data: {"productAmount": productAmount, "price": price, "productId": itemId},
                                        success: function (data) {
                                            if (data==2){
                                                alert("购物车中已存在该商品！")
                                            }
                                            if (data==1){
                                                alert("添加成功！")
                                            }
                                            if(data==0){
                                                alert("发生错误，请重试一下！")
                                            }
                                        }
                                    })
                                }else {
                                    $("#error").show();
                                }
                            }
                        })
                    });
                    $("#cancel").on("click",function () {
                        $(".alert").hide();
                    })
                }
            }
        })
    })
})