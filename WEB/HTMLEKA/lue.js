
function allowDrop(ev) {ev.preventDefault();}
function drop(ev) {
    ev.preventDefault();
    var files = ev.dataTransfer.files;
    for (var i = 0; i < files.length; i++) {
        var file = files[i];
        var reader = new FileReader();
        reader.onload = function (e) {
            var text = reader.result;
            console.log(text);
            var itemi = document.createElement("p")
            itemi.innerText = (text);


            //.appendChild(document.getElementById(text));;
        }
        reader.readAsText(file, "utf-8");
    }
}
