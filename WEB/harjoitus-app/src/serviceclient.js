import React, {Component} from 'react';


const palveluurl = '/api'; // kun proxy asetettu
export function haekaikki(sanonta, callback) {
    fetch(palveluurl + '/all', {accept: 'application/json'})
        .then((function (response) {

            callback();
        }));
} // tätä voi käyttää pohjana
