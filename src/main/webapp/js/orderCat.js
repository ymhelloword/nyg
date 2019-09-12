$(function () {
    var $delete = $(".deleted");
    $delete.on("click",function () {
        var $order = $(this);
        var itemId = $(this).parents("tr").attr("value");
        var productAmount = $(this).parents("tr").children(".productAmount").attr("value");
        $.ajax({
            url:"/nyg/orderCart",
            type:"post",
            dataType:"json",
            data:{_method:"DELETE",productId:itemId},
            success:function (data) {
                $order.parents("tr").remove();
            }
        })
    })
})