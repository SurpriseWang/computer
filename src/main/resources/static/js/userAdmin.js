$(document).ready(function () {
    //用户账号管理
    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white'>用户信息管理:</h4>" +
        "<form id='userAdminForm' action='Http://localhost:8080/deleteUsersById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllUser", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                var homeTr = $("#tbodyDiv #tr" + i + "");
                $("<td><input type='checkbox' name='userId' value=" + v.userId + "></td>").appendTo(homeTr);
                $("<td><h5>用户名：" + v.userName + " </h5></td>").appendTo(homeTr);
                $("<td><h5>用户密码：" + v.userPassword + "</h5></td>").appendTo(homeTr);
            });
            $("<center>" +
                "<button type='button' class='btn btn-success' " +
                "data-toggle='modal' data-target='#createUser'>新建,添加用户</button>" +
                "&nbsp;&nbsp;&nbsp;" +
                "<button type='submit' class='btn btn-danger'" +
                "height: 50px;width: 100px;color: white'>删除所选账号</button>" +
                "</center>").appendTo($("#userAdminForm"));
        }
    });
});
