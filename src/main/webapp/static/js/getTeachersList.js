function getTeachersList() {
    $.ajax({
        type: "GET",
        url: "/teachers",
        data: "",
        contentType: "application/json",
        dataType: "json",
        success: function (result) {

            document.getElementById("demo").innerHTML = "jdfbvdjfbvfvb";
            result.forEach(function(entry) {
                console.log(entry);
            });
        }
    });
}