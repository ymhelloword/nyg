$(function () {
    var $page = $(".page");
    $page.on("click",function (event) {
        event.preventDefault()
        var page = $(this).text();
        index = window.location.href.lastIndexOf("/")+1;
       window.location.href = window.location.href.substring(0,index)+page;
    })
})