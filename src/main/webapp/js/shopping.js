$(function() {
    var $add = $(".add");
    var $less = $(".less");
    var $number = $(".number");
    var $buy = $(".buy");
    var $delete = $(".deleted");
    $add.on("click",function () {
        $number.val(parseInt($number.val())+1);
    })
    $less.on("click",function () {
         var number = parseInt($number.val());
         if (number<=1){
             alert("商品数量不能小于1");
             return;
         }
         $number.val(number-1);

    });
    $delete.on("click",function () {
        var index = $(this).parents("tr").index();
        $.ajax({
            url:"/nyg/orderCart",
            type:"post",
            dataType:"json",
        })
    })
})