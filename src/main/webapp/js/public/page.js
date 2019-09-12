window.onload=function () {
     var $left = $("#left");
     var $right =  $("#right");
     var sumPage = parseInt($(".sum-page").html());
     var $pageNumber = $(".page-number");
     var $jump = $(".jump");
    $right.on("click",function () {
         var le = $right.siblings(".page");
         if (le[3].innerHTML>=sumPage){
            return;
         }
        for (var i=0;i<le.length;i++){
            le[i].innerHTML=parseInt(le[i].innerHTML)+1;
            le[i].href=le[i].innerHTML
        }
    })
    $left.on("click",function () {
        var le = $right.siblings(".page");
        if (le[0].innerHTML<=1){
            return;
        }
        for (var i=0;i<le.length;i++){
            le[i].innerHTML=parseInt(le[i].innerHTML)-1;
            le[i].href=le[i].innerHTML
        }
    })
    $pageNumber.blur(function () {
        if ($pageNumber.val()>sumPage){
            $pageNumber.val(sumPage);
        }
    })
    $jump.on("click",function () {

    })
    // $.ajax({
    //     url:"/nyg/supply/1",
    //     dataType:"json",
    //     type:"POST",
    //     data:JSON.stringify({pageSize:'20'}),
    //     success:function (data) {
    //         console.log(data)
    //     },
    //     error:function (e) {
    //         alert("发送cw")
    //     }
    // })
    $("#hot_ul li").on("click",function () {
        var href = $(this).find("a").attr("href");
        location.href=href;
    })
}