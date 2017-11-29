import React, {Component} from 'react';

class LomakeTiedot extends Component {
    render() {
        return(
            <div className="lomakeosa">
                <h2>Lomakkeen tiedot:</h2>
                <p>Etunimi: {this.props.hlo.etunimi}</p>
                <p>Sukunimi: {this.props.hlo.sukunimi}</p>
            </div>
        );
    }
}
LomakeTiedot.defaultProps = {hlo: {etunimi:'Kalle', sukunimi:'Helminen'}}
export default LomakeTiedot;