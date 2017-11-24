var lista = document.getElementById("kuvia");
$.getJSON('http://api.flickr.com/services/feeds/photos_public.gne?jsoncallback=?',
    {
        tags: "autumn",
        tagmode: "any",
        format: "json"
    }).done(function(data) {
    console.dir(data);
    var mediaolio =
    $.each(data.items, function (indeksi, mediaolio) {
        $("<p>").text(mediaoli.media.m).appendChild("body")
    })


});