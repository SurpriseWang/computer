$(document).ready(function () {
    //导航栏信息
    $('.nav-left-container').on('click', 'li', function () {
        $(this).find('.glyphicon-menu-right').removeClass('glyphicon-menu-right').addClass('glyphicon-menu-down');
        $(this).addClass('active').children('.nav-left-container-small').slideDown()

        $(this).siblings().removeClass('active').children('.nav-left-container-small').slideUp()
        $(this).siblings().find('.glyphicon-menu-down').removeClass('glyphicon-menu-down').addClass('glyphicon-menu-right ');
    });

    //获取登录Cookie账户
    //提示登录用户名信息
    var userName = $.cookie('userName');
    $("#userName").html(userName);
    //工单申请
    $("#worksheetInsert").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("worksheetInsert.html");
    });
    //工单撤回
    $("#worksheetBack").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("worksheetBack.html");
    });
    //历史全部工单
    $("#worksheetAll").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("worksheetAll.html");
    });


    $("#allCabinet").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("allCabinet.html");
    });

});