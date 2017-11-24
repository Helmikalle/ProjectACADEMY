var req = new XMLHttpRequest();
var lista = document.getElementById("lista");
req.onreadystatechange = function () {
    if (req.readyState === 4) {
        var jsonOlio = JSON.parse(req.responseText);
        console.dir(jsonOlio);
        for (var i = 0; i < jsonOlio.length; i++) {

            var stilisointi = {hour: "2-digit", minute: "2-digit", hour12: false};
            var lielem = document.createElement("li");
            lielem.appendChild(document.createTextNode(jsonOlio[i].stationShortCode
                + " " + jsonOlio[i].stationName));
            lista.appendChild(lielem);
        }
    }


}
req.open('get', 'https://rata.digitraffic.fi/api/v1/metadata/stations', true);
req.send();