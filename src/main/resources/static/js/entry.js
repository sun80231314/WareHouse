function entryFoodList()
{

    var name = $("#Fname").val();
    var standard = $("#Fstandard").val();
    var unit = $("#Funit").val();
    var price = $("#Fprice").val();
    var producedate = $("#Fproducedate").val();
    var guaranteeperid = $("#Fguaranteeperid").val();
    var number = $("#Fnumber").val();
    var posencode = $("#Fposencode").val();
    var entryman = $("#Fentryman").val();
    var entyrdate = $("#Fentyrdate").val();
    var gedencode = $("#Fgedencode").val();
    var finish = $("#Finish").val();

    $.ajax({
        url: "/food-remander/in-food",
        type: "POST", //请求的方式
        dataType : 'json',
        data: {
            "name":name,
            "standard":standard,
            "unit":unit,
            "price":price,
            "producedate":producedate,
            "guaranteeperid":guaranteeperid,
            "number":number,
            "posencode":posencode,
            "entryman":entryman,
            "entyrdate":entyrdate,
            "gedencode":gedencode,
            "finish":finish
        },
        error:function (data) {
            alert("操作失败")
        },
        success:function (data) {
            if(data.state == 1){
                alert("success")
            }
        }
    });



}