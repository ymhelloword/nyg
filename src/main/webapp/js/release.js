$(function () {
    var $release = $("#release");
    $release.on("click",function () {
        var productInfo = new FormData($("form")[0]);
        $.ajax({
            url:"/nyg/purchase",
            data:productInfo,
            type:"post",
            dataType:"json",
            processData: false,
            contentType: false,
            success:function (data) {
                alert(data)
            }
        })
    })


})