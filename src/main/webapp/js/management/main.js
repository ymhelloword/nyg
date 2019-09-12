$(function () {
    var $features = $(".uo div");
    $features.on("mouseover",function () {
        $(this).siblings("ul").show();
        $(this).parent(".uo").siblings(".uo").children(".features-option").hide();
    });
    var $sort_1 = $("#sort_1");
    var $sort_2 = $("#sort_2");
    var $sort_3 = $("#sort_3");
    var $sort_2_box = $(".sort_2");
    $sort_2.on("click",function (event) {
        event.preventDefault();
        if ($sort_1.val()==0){
            alert("请先选择商品分类1");
            return;
        }
        switch ($sort_1.val()) {
            case "1":$(".fruit_and_vegetable").show();break;
            case "2":$(".rice").show();break;
        }

        $(this).parent("div").on("mouseleave ",function () {
            $sort_2_box.hide();
        })
    });
    $sort_3.on("click",function (event) {
        event.preventDefault();
        if ($sort_1.val()==0||$sort_2.val()==0){
            alert("请先选择商品分类1");
            return;
        }
        var a = $sort_1.val()+$sort_2.val()+"";
        switch (a) {
            case "11":$("#vegetable").show();break;
            case "12":$("#fruit").show();break;
            case "21":$("#rice").show();break;
            case "22":$("#rice").show();break;
            case "23":$("#edible_oil").show();break;
        }
        $(this).parent("div").on("mouseleave ",function () {
            $(".sort_3").hide();
        })
    });
    var $a = $(".sort_2 a");
    $a.on("click",function () {
       // $sort_2.empty().append("<option value=\""+$(this).attr("value")+"\">"+$(this).text()+"</option>")
        $sort_2.children("option").text($(this).text());
        $sort_2.children("option").attr("selected","selected").attr("value",$(this).attr("value"))
    })
    var $b = $(".sort_3 a");
    $b.on("click",function () {
        // $sort_2.empty().append("<option value=\""+$(this).attr("value")+"\">"+$(this).text()+"</option>")
        $sort_3.children("option").text($(this).text());
        $sort_3.children("option").attr("selected","selected").attr("value",$(this).attr("value"))
    })
    $("#add").on("click",function () {
        var productInfo = new FormData($("form")[0]);
        $.ajax({
            url:"/nyg/addProduct",
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