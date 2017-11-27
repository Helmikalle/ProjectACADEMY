import React, {Component} from 'react';


class Quote extends Component {
    render() {
        return (
            <div>
                <li>
                    <p><i>"{this.props.sanonta.virsi}"</i></p>
                    <h6>-{this.props.sanonta.nimi}</h6>
                </li>
            </div>

        );
    }
}

export default Quote;