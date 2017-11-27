import React, {Component} from 'react';

class Lomake extends Component {
    state = {
        name: '',
        email: ''
    };

    onSubmit = (e) => {
        e.preventDefault();
        console.log(this.state)
    };

    render() {
        return (
            <form>
                <input type="text" placeholder="Name"
                       value={this.state.name} onChange={e => this.setState({name: e.target.value})}/>
                <input type="text" placeholder="email"
                       value={this.state.email} onChange={e => this.setState({email: e.target.value})}/>
                <input type="submit" onClick={e => this.onSubmit(e)}/>
            </form>
        );
    }
}

export default Lomake;