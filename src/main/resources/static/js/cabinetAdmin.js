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
                $("<td id='deleone'><input type='checkbox' name='cabinetId' value=" + v.cabinetId + "></td>").appendTo(homeTr);
                $("<td><h5>机房设备总数：" + v.cabinetDescribe + " </h5></td>").appendTo(homeTr);
                $("<td><h5>机房地址：" + v.cabinetAddress + "</h5></td>").appendTo(homeTr);
            });
            $("<center id='delesecond'><button type='button' class='btn btn-success' " +
                "data-toggle='modal' data-target='#createCabinet'>新建,添加机柜</button>" +
                "&nbsp;&nbsp;&nbsp;" +
                "<button type='submit' class='btn btn-danger'" +
                "height: 50px;width: 100px;color: white'>删除所选机柜</button>" +
                "</center>").appendTo($("#cabinetAdminForm"));
        }
    });
});
