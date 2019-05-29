$(".form-login").hide();
$(".form-register").hide();
$(function () {
    $("#btn").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        $.post("api/login", {username: username, password: password}, function (response) {
            if (response == 1) {
                location.reload();
            } else {
               $("#msg-error").html("<small style='color: red'>Tên tài khoản hoặc mật khẩu không chính xác</small>")
            }
        }, "text");
    });
    $("#login").click(function () {
        $(".form-login").fadeIn(500);
    });
    $(".btn-close").click(function () {
        $(".form-login").fadeOut(500);
        $(".form-register").fadeOut(500);
    });
    $("#register").click(function () {
        $(".form-register").fadeIn(500);
    });
    // register valid
    $("#username-reg").blur(function () {
        var username_reg = $("#username-reg").val();
        if (username_reg == "" || username_reg.length <= 5) {
            $("#error-username").html("<small class='m-2' style='color:red'>Tên tài khoản phải lớn hơn 5 ký tự</small>");
        } else {
            $.post("api/check-username", {username: username_reg}, function (resp) {
                if (resp == "1") {
                    $("#error-username").html("");
                } else {
                    $("#error-username").html("<small class='m-2' style='color:red'>Tài khoản đã tồn tại</small>");
                }
            }, "text");

        }
    });
    $("#password-reg").blur(function () {
        var password_reg = $("#password-reg").val();
        if (password_reg.length < 8) {
            $("#error-password").html("<small class='m-2' style='color:red'>Mật khẩu phải lớn hơn 7 ký tự</small>");
        } else {
            $("#error-password").html("");
        }
    });
    $("#rpassword-reg").blur(function () {
        var password_reg = $("#password-reg").val();
        var rpassword_reg = $("#rpassword-reg").val();
        if (password_reg != rpassword_reg) {
            $("#error-rpassword").html("<small class='m-2' style='color:red'>2 mật khẩu không khớp</small>");
        } else {
            $("#error-rpassword").html("");
        }
    });
    $("#btn-register").click(function () {
        var username_reg = $("#username-reg").val();
        var password_reg = $("#password-reg").val();
        var rpassword_reg = $("#rpassword-reg").val();
        if (username_reg.length > 5 && password_reg === rpassword_reg) {
            $.post("api/register", {username: username_reg, password: password_reg}, function (response) {
                if (response == "1")
                    alert("Đăng ký thành công !");
            });
        }
    });
})