$(".form-login").hide();
$(function () {
    $("#btn").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        $.post("api/login", {username: username, password: password}, function (response) {
            if(response == 1){
                alert("Đăng nhập thành công !");
                location.reload();
            }else{
                alert("Đăng nhập thất bại !")
            }
        }, "text");
    });
    $("#login").click(function() {
        $(".form-login").fadeIn(500);
    });
    $(".btn-close").click(function() {
        $(".form-login").fadeOut(500);
    });
})