import React, { Component } from 'react';



class Quote extends Component {
    render(){
        return(
            <div>
                <li>
                <p>{this.props.sanonta.nimi}</p>
                <p>{this.props.sanonta.virsi}</p>
                </li>
            </div>

        );
    }
}
export default Quote;