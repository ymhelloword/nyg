$(function () {
    $("img").lazyload({
        threshold : 200,
        effect : "fadeIn"
    });
    var $mainMenuChildLi = $("#left-tab .main-menu>li");
    $mainMenuChildLi.hover(function () {
        var index = $(this).index() ;
       $($(".second-menu")[index]).fadeIn().siblings(".second-menu").fadeOut() ;
    },function () {
       /* $(this).children("div").stop().hide() ;
        $(this).children("div")({"border":"none"}) ;*/
        //$(this).parent().siblings("li").children("div").stop().hide(600);
    });
    $(".left-tab>div").mouseleave(function () {
        $(this).children(".second-menu").fadeOut();
    });
    /*chang-img块的图片的翻页*/
    var $toLeft = $(".chang-img .img-top .to-left");
    var $toRight = $(".chang-img .img-top .to-right");
    var $imgUl = $(".chang-img .img-top ul") ;
    var $index = $(".chang-img .img-top .slider-buttons") ;
    var $imgTop = $(".chang-img .img-top") ;
    var target = false ;
    var index = 0 ;
    var time ;
    $toRight.click(function () {
        cartoon();
    });
    $toLeft.click(function () {
        var position = $imgUl.position().left ;
        if (target===true)return ;
        $($index.children("span")[index]).removeClass("bg");
        if (index<=0){
            index=4;
        }
        target = true ;
        if (position===-748){
            $imgUl.css("left",-748*5);
            target = true ;
        }
        $($index.children("span")[index-1]).addClass("bg");
        index--;
        position = $imgUl.position().left ;
        $imgUl.stop().animate({
            left:position+748
        },2000,function () {
            target = false ;
        });

    });
        time = setInterval(function () {
        cartoon();
    },4000);
    $imgTop.hover(function () {
        clearTimeout(time) ;
    },function () {
        time = setInterval(function () {
            cartoon();
        },2000);
    });
    //hot-ul >li 点击触发a标签的href连接
    $(".hot-ul >li").click(function () {
        var obj = $(this).children("a");
        window.location.href=$(obj[0]).attr("href") ;
    });
    //回到顶部的固定标签
    function f(){
        var distance = $(".fixed-btn")[0].offsetTop;
        if (distance>1200){
            $(".fixed-btn").css(display,"none");
        }
    }
    $("#register").on("click",function () {
       window.location.href="/nyl/login";
    });
    function cartoon() {
        var position = $imgUl.position().left ;
        if (target===true)return ;
        if (index>3){
            index=0;
        }
        if (position<(-748*4)){
            $imgUl.css("left",0);
            $($index.children("span")[0]).addClass("bg");
            target = true ;
        }
        $($index.children("span")[index+1]).addClass("bg");
        $($index.children("span")[index]).removeClass("bg");
        target = true ;
        index++ ;
        position = $imgUl.position().left ;
        $imgUl.stop().animate({
            left:position-748
        },2000,function () {
            target = false ;
        })
    }
    var $searchButton = $(".search-button");
    var $searchName = $(".search-text-model");
    $searchButton.on("click",function () {
        var value = $searchName.val();
        if (value!=null&&value!==""){
            location.href="/nyg/items/1?productName="+value;
        }
    });
    // var loginName = $.cookie("loginName");
    // var password = $.cookie("password");
    // console.log(loginName+"...."+password);
    // $.ajax({
    //     url:"/nyg/verificationUser",
    //     type:"json",
    //     data:{"loginName":loginName,"password":password},
    //     success:function (data) {
    //         if (data.msg>1){
    //             $("login-right").empty().html("<span>欢迎您</span>")
    //             alert("jd");
    //         }else {
    //
    //         }
    //     }
    // })
});
