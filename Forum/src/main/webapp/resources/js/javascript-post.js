$(function() {
    $(".like").click(function() {
        $(".show").addClass("active");
        $(".show-dialog").addClass("active");
    })
    $(".btn-cancel").click(function() {
        $(".show").removeClass("active");
        $(".show-dialog").removeClass("active");
    });
})