$(document).ready(function () {
    $("#sbmt").click(function(){

        $.post("/test/user/login", { username: $("#username").val(), password: $("#password").val()},
            function(data){
                console.log(data);
            });

    });

});