$(function () {
    var $main = $(".main");
    var child = $main.children(".item");
    if (child.length===0){
       $main.css({
           // backgroundImage:"url("+bgimage+")",
           backgroundRepeat:"no-repeat",
           backgroundSize:"cover"
       },
        $main.append("<h5 style='text-align: center;margin-top:240px;'>抱歉哦！没有相应的商品。。。</h5>")
        );
    }else {

    }
    $main.delegate(".item","click",function () {
        var href = $(this).find("a").attr("href");
        location.href=href;
    })
});