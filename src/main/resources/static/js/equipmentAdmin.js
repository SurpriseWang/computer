$(document).ready(function () {

    var indexBody = $("#indexBody");
    $("<h4 style='border:10px solid #06da93;background-color: #06da93;color: white'>设备管理：</h4>" +
        "<div style='height: 47px;width: 100%;'><form action='Http://localhost:8080/queryEquipmentByExample' " +
        "class='form-check form-check-inline' style='width: 100%'>" +
        "<label style='width: 120px;margin-top: 4px;margin-bottom: 4px;margin-left: 40px;' for='cabinetInput'>请选择机房信息:</label>" +
        "<select style='width: 350px;' class='form-control' id='cabinetInput' name='cabinetInput'></select>" +
        "<label style='width: 120px;margin-top: 4px;margin-bottom: 4px;margin-left: 40px;' for='storehouseInput'>请选择库房信息:</label>" +
        "<select style='width: 350px;' class='form-control' id='storehouseInput' name='storehouseInput'></select>" +
        "<input style='margin-left: 40px;' type='button' class='btn btn-primary' value='筛选'>" +
        "</form></div><form id='buttonForm' action='Http://localhost:8080/deleteEquipmentById'>" +
        "<table class='table table-striped table-hover'><tbody id='tbodyDiv'></tbody></table>" +
        "</form>"
    ).appendTo(indexBody);
    var tbodyDiv = $("#tbodyDiv");
    $.ajax({
        url: "Http://localhost:8080/queryAllEquipment", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + "></tr>").appendTo(tbodyDiv);
                var homeTr = $("#tbodyDiv #tr" + i + "");
                $("<td><input type='checkbox' name='equipmentId' value=" + v.equipment.equipmentId + "></td>").appendTo(homeTr);
                $("<td><h5>设备描述：" + v.equipment.equipmentDescribe + " </h5></td>").appendTo(homeTr);
                $("<td><h5>库房地址：" + v.storehouse.storehouseAddress + "</h5></td>").appendTo(homeTr);
                $("<td><h5>机房地址：" + v.cabinet.cabinetAddress + "</h5></td>").appendTo(homeTr);
                if (v.equipment.equipmentOnline == 1)
                    $("<td><h5>机器是否上线：是</h5></td>").appendTo(homeTr);
                else $("<td><h5>机器是否上线：否</h5></td>").appendTo(homeTr);
            });
            $("<center><button type='button' class='btn btn-success' " +
                "data-toggle='modal' data-target='#createEquipment'>新建,添加设备</button>" +
                "&nbsp;&nbsp;&nbsp;" +
                "<button type='submit' class='btn btn-danger'" +
                "height: 50px;width: 100px;color: white'>删除所选设备</button>" +
                "</center>").appendTo($("#buttonForm"));
        }
    });

    $.ajax({
        url: "Http://localhost:8080/queryAllCabinet", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<option value='" + v.cabinetId + "'>" + "机房地址：" + v.cabinetAddress
                    + ",机房设备总数:" + v.cabinetDescribe + "</option>").appendTo($("#equipmentCabinet"));
                $("<option value='" + v.cabinetId + "'>" + "机房地址：" + v.cabinetAddress + "</option>").appendTo($("#cabinetInput"));
            });
        }
    });
    $.ajax({
        url: "Http://localhost:8080/queryAllStorehouse", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<option value='" + v.storehouseId + "'>" + "库房地址：" + v.storehouseAddress
                    + ",库房设备总数:" + v.storehouseDescribe + "</option>").appendTo($("#equipmentStorehouse"));
                $("<option value='" + v.storehouseId + "'>" + "库房地址：" + v.storehouseAddress + "</option>").appendTo($("#storehouseInput"));
            });
        }
    });
});
