import React, {Component} from 'react';


class Lomake extends Component {
    state = {
        etunimi: '', sukunimi: ''
    };

    onSubmit = (e) => {
        e.preventDefault();
        if (this.props.callback) {
            this.props.callback(this.state);
        }
        this.setState({etunimi: '', sukunimi: ''});
    }

    render() {
        return (
            <form>
                <input type="text" placeholder="Etunimi"
                       value={this.state.etunimi} onChange={e => this.setState({etunimi: e.target.value})}/>
                <input type="text" placeholder="Sukunimi"
                       value={this.state.sukunimi} onChange={e => this.setState({sukunimi: e.target.value})}/>
                <input type="submit" onClick={e => this.onSubmit(e)} defaultValue="Käsittele"/>
            </form>
        );
    }
}

export default Lomake;