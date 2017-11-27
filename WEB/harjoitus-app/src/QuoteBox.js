import React, { Component } from 'react';
import QuoteList from './QuoteList';

var sanonnat = [{id:1, nimi:'jonne', virsi:'blabla'},
                {id:2, nimi:'jannu', virsi:'jonnet ei tiedä'}]

class QuoteBox extends Component {
render(){
    return(<div>
            <h1>Sanontoja</h1>
            <QuoteList sanonnat={data}/>
        </div>

    );
}
}
export default QuoteBox;