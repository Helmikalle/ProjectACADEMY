$(function () {
    $("h2").click(function () {
        var $klikattu = $(this);
        console.log($klikattu.text());
        var $piilotettava = $klikattu.next();
        $piilotettava.toggleClass("piilo")
    });

});
