import React, {Component} from 'react';
import MyComponent from './MyComponent';

class Lomake extends Component {
    render() {

        return (
            <form>
                <input type="text" placeholder="Name"
                       value={this.state.name} onChange={this.handleNameChange}/>
                <input type="text" placeholder="email"
                       value={this.state.email} onChange={this.handleEmailChange}/>
                <input type="submit" value="Create" onClick={this.handleCreateClick}/>
            </form>
        );
    }
}

export default Lomake;