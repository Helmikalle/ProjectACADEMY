
const palveluurl = 'api/'; // kun proxy asetettu
export function haekaikki(callback) {
fetch (palveluurl + 'all', {accept: 'application/json'})
    .then(function(response) {
        response.json().then(function(json) {
            if (response.status >= 500)
                callback(json, response.status);
            else
                callback(json);
        });
    });
}

export function luoquote(quote, callback) {
    fetch(palveluurl + 'all/',  {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify(quote)
    })
        .then((function(response) {
            callback();
        }));
}