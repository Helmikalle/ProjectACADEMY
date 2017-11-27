import React, { Component } from 'react';
import QuoteList from './QuoteList';



class QuoteBox extends Component {
render(){
    return(<div>
            <h1>Sanontoja</h1>
            <QuoteList sanonnat={sanonnat}/>
        </div>

    );
}
}
var sanonnat = [{nimi:'jonne', virsi:'blabla'},
    {nimi:'jannu', virsi:'jonnet ei tiedä'}]
export default QuoteBox;