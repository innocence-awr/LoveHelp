/**
 * Created by admin on 2018/3/21.
 */
$(document).ready(function(){
    var page_id = "#index";
    //删除
    $(page_id+" #deleteBtn").bind("click",function(){

        var id =  $(this).attr("val");
        var index =  $(this).attr("index");
        $.ajax({
            "url":"/user/"+id,
            "type":"DELETE",
            "data":{},
            "success":function(re){
                console.log("tr_"+index)
                $(".tr_"+index).remove();
            },
            "error":function(res){
                alert(res.statusText);
            }
        });
    });

});