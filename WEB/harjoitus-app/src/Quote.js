import React, { Component } from 'react';



class Quote extends Component {
    render() {
        return (
            <li className="quote">
                <p>{this.props.sanonta.nimi}</p>
                <p>{this.props.sanonta.virsi}</p>
            </li>
        );
    }
}

export default Quote;
