$(document).ready(function () {
    //导航栏信息
    $('.nav-left-container').on('click', 'li', function () {
        $(this).find('.glyphicon-menu-right').removeClass('glyphicon-menu-right').addClass('glyphicon-menu-down');
        $(this).addClass('active').children('.nav-left-container-small').slideDown()

        $(this).siblings().removeClass('active').children('.nav-left-container-small').slideUp()
        $(this).siblings().find('.glyphicon-menu-down').removeClass('glyphicon-menu-down').addClass('glyphicon-menu-right ');
    });
    //获取登录Cookie账户
    //提示登录管理员名信息
    var adminName = $.cookie('adminName');
    $("#adminName").html(adminName);

    //用户管理
    $("#userAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("userAdmin.html");
    });

    //机柜管理
    $("#cabinetAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("cabinetAdmin.html");
    });

    //设备管理
    $("#equipmentAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("equipmentAdmin.html");
    });
    //库房管理
    $("#storehouseAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("storehouseAdmin.html");
    });
    //当前用户待回复工单
    $("#worksheetReturn").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("worksheetReturn.html");
    });
    //当前管理员相关工单管理
    $("#worksheetDelete").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("worksheetDelete.html");
    });
    //全部设备信息
    $("#allEquipmentAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("allEquipmentAdmin.html");
    });
    //全部机柜信息
    $("#allCabinetAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("allCabinetAdmin.html");
    });
    //全部库房信息
    $("#allStorehouseAdmin").click(function () {
        var htmlBody = $("#htmlBody");
        htmlBody.html("");
        htmlBody.load("allStorehouseAdmin.html");
    });
});