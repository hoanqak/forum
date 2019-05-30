var path = "/Forum_war_exploded/";
$(function() {
    // $(".like").click(function() {
    //     $(".show").addClass("active");
    //     $(".show-dialog").addClass("active");
    // })
    // $(".btn-cancel").click(function() {
    //     $(".show").removeClass("active");
    //     $(".show-dialog").removeClass("active");
    // });

    $("#btn-send-comment").click(function () {
        var arrPath = window.location.pathname.split("/");
        var content = $("#content").val();
        $.get(path + "api/comment", { content : content, categoryId : arrPath[2], id : arrPath[3]}, function (resp) {
            if(resp == 1){
                window.location.reload();
            }else{
                alert("Thất bại");
            }
        }, "text");
        return false;
    })
})