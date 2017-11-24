var a = document.getElementById("syöte1");
var b = document.getElementById("syöte2");
var tuloskentta = document.getElementById("tulos")
function ekaPainike() {
    var na = parseFloat(a.value);
    var nb = parseFloat(b.value);
    tuloskentta.value = na + nb;
}