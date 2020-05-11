$(document).ready(function () {
    //机柜管理
    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white'>机柜管理：</h4>" +
        "<form id='cabinetAdminForm' action='Http://localhost:8080/deleteCabinetById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllCabinet", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                var homeTr = $("#tbodyDiv #tr" + i + "");
                $("<td><h5>机房地址：" + v.cabinetAddress + "</h5></td>").appendTo(homeTr);
                $("<td><h5>机房设备总数：" + v.cabinetDescribe + " </h5></td>").appendTo(homeTr);
            });
        }
    });
});
