import React, {Component} from 'react';

class Lomake extends Component {
    state = {
        etuninmi: '', sukunimi: ''
    };

    onSubmit = (e) => {
        e.preventDefault();
        console.log(this.state)
        this.props.kutsuttava(this.state);
        this.setState ({etuninmi: '', sukunimi: ''})
    };

    render() {
        return (
            <form>
                <input type="text" placeholder="Etunimi"
                       value={this.state.etunimi} onChange={e => this.setState({etuninmi: e.target.value})}/>
                <input type="text" placeholder="Sukunimi"
                       value={this.state.sukunimi} onChange={e => this.setState({sukunimi: e.target.value})}/>
                <input type="submit" onClick={e => this.onSubmit(e)} defaultValue="Käsittele"/>
            </form>
        );
    }
}
LomakeTiedot.defaultProps = {hlo: {etunimi:'Jukka', sukunimi:'Pulkkinen'}}
export default Lomake;