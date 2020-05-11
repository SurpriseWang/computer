$(document).ready(function () {
    //当前管理员相关工单管理
    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white;margin: 0'>当用户相关工单管理：</h4>" +
        "<form id='buttonForm' action='Http://localhost:8080/deleteWorkSheetById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllWorksheetUser", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                var homeTr = $("#tbodyDiv #tr" + i + "");
                $("<td><input type='checkbox' name='worksheetId' value=" + v.worksheet.worksheetId + "></td>").appendTo(homeTr);
                $("<td><h5>工单内容：" + v.worksheet.worksheetContent + " </h5></td>").appendTo(homeTr);
                if (v.worksheet.worksheetApproval == 1)
                    $("<td><h5>工单是否被审批：已审批</h5></td>").appendTo(homeTr);
                else $("<td><h5>工单是否被审批：未审批</h5></td>").appendTo(homeTr);
                $("<td><h5>工单指定管理员：" + v.admin.adminName + " </h5></td>").appendTo(homeTr);
            });
            $("<center> <button type='submit' class='btn btn-danger'" +
                "height: 50px;width: 100px;color: white'>删除所选工单</button>" +
                "</center>").appendTo($("#buttonForm"));
        }
    });
});
