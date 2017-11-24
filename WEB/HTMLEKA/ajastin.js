(function () {
    var varoitusajastin;

    function x() {
        alert("m")
    }

    function nollaaAjastimet() {
        clearTimeout(varoitusajastin);
        varoitusajastin = setTimeout(x, 3000);


    }

    document.onmousemove = nollaaAjastimet;
    document.onkeydown = nollaaAjastimet;
    nollaaAjastimet();
})();
