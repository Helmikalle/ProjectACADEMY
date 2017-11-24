
var req = new XMLHttpRequest();
var lista = document.getElementById("lista");
req.onreadystatechange= function () {
    if (req.readyState ===4){
        var jsonOlio = JSON.parse(req.responseText);
        console.dir(jsonOlio);
        for (var i = 0 ; i < jsonOlio.length; ++i){
            var lielem = document.createElement("li");
            lielem.appendChild(document.createTextNode(jsonOlio[i].id + " " + "" + jsonOlio[i].name + " " + jsonOlio[i].email));
            lista.appendChild(lielem);
        }

    }

}
function painike () {
    req.open('GET', 'http://localhost:3000/api/personnel', false);
    req.send(null);
}


