$(document).ready(function () {
    //机柜管理
    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white'>库房管理：</h4>" +
        "<form id='buttonForm' action='Http://localhost:8080/deleteStorehouseById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllStorehouse", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                var homeTr = $("#tbodyDiv #tr" + i + "");
                $("<td><h5>库房地址：" + v.storehouseAddress + "</h5></td>").appendTo(homeTr);
                $("<td><h5>库房设备总数：" + v.storehouseDescribe + " </h5></td>").appendTo(homeTr);
            });
        }
    });
});
