import React, { Component } from 'react';
import Quote from './Quote';


class QuoteList extends Component {
    render(){
        var sanontaolio = this.props.sanonnat.map(function (sanonta,index) {
            return <Quote sanonta={sanonta} key ={index}/>
        })
        return(<div>
                {sanontaolio}
            </div>

        );
    }
}
export default QuoteList;