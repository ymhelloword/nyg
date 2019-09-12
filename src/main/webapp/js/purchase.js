$(function () {
    var $purchases = $(".purchases");
    var $page = $(".page");
    $page.on("click",function (event) {
        event.preventDefault();
        var url = window.location.href+"/"+$(this).attr("href");
        $.ajax({
            url:url,
            type:"get",
            dataType:"json",
            success:function (data) {
                // var purchase = $purchases.children("a");
                // var number = data.length;
                // for (var a=0;a<purchase.length;a++){
                //     if (a>=number){
                //         break;
                //     }
                //     var li =$(purchase[a]).find("li");
                //     $(li[0]).text(data[a].productName);
                //     $(li[1]).text(data[a].productQuantity);
                //     $(li[2]).text(data[a].placeOfOrgin);
                //
                // }
                var number = data.length;
                $purchases.empty();
                for (var a=0;a<number;a++){
                    $purchases.append("<a href=\"\"  id=\"purchase\">\n" +
                        "                            <div class=\"info\">\n" +
                        "                                <ul>\n" +
                        "                                    <li class=\"variety\">"+data[a].productName+"</li>\n" +
                        "                                    <li class=\"number\">"+data[a].productQuantity+"</li>\n" +
                        "                                    <li class=\"place\">"+data[a].placeOfOrgin+"</li>\n" +
                        "                                    <li class=\"publisher\">张三</li>\n" +
                        "                                    <li class=\"certification\"></li>\n" +
                        "                                    <li class=\"details\">查看详情</li>\n" +
                        "                                </ul>\n" +
                        "                            </div>\n" +
                        "                        </a>")

                }
            }
        })
    });
})