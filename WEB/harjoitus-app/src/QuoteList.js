import React, { Component } from 'react';
import Quote from './Quote';


class QuoteList extends Component {
    render(){
        var sanontaolio = this.props.sanonnat.map(function (sanonta) {
            return <Quote sanonta={sanonta} key ={sanonta.id}/>
        })
        return(<div>
                {sanontaolio}
            </div>

        );
    }
}
export default QuoteList;