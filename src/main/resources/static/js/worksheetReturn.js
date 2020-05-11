$(document).ready(function () {
    //当前用户待回复工单
    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white;margin: 0'>当前用户待回复工单：</h4>" +
        "<form id='buttonForm' action='Http://localhost:8080/returnWorkSheetById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllReturnWorksheet", type: "post",
        success: function (successReturnValue) {
            if (successReturnValue.length == 0) {
                $("<center><h4>当前无待审批工单</h4></center>").appendTo(tbodyDiv);
            } else {
                $.each(successReturnValue, function (i, v) {
                    $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                    var homeTr = $("#tbodyDiv #tr" + i + "");
                    $("<td><input type='checkbox' name='worksheetId' value=" + v.worksheet.worksheetId + "></td>").appendTo(homeTr);
                    $("<td><h5>工单内容：" + v.worksheet.worksheetContent + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>工单是否被审批：未审批</h5></td>").appendTo(homeTr);
                    $("<td><h5>工单指定用户：" + v.user.userName + " </h5></td>").appendTo(homeTr);
                });
                $("<center> <button type='submit' class='btn btn-danger'" +
                    "height: 50px;width: 100px;color: white'>通过所选工单</button>" +
                    "</center>").appendTo($("#buttonForm"));
            }
        }
    });
});
