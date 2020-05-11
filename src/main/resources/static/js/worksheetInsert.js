$(document).ready(function () {
    $.ajax({
        url: "Http://localhost:8080/queryAllAdminName", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<option value='" + v.adminId + "'>" + v.adminName + "</option>").appendTo($("#worksheetAdmin"));
            });
        }
    });
    $.ajax({
        url: "Http://localhost:8080/queryAllEquipment", type: "post",
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                $("<option value='" + v.equipment.equipmentDescribe + "'>设备描述：" + v.equipment.equipmentDescribe + " </option>").appendTo($("#worksheetEquipment"));
            });
        }
    })
});
