import React, {Component} from 'react';


class MyComponent extends Component {
    state = {big: false};
    handleClick = () => {
        this.setState({big: !this.state.big});
    }

    render() {
        const msg = 'Here\'s looking at you, ' + this.props.name + '!';
        return( <div onClick={this.handleClick}>
            {this.state.big ? msg.toUpperCase() : msg}
        </div>);
    }
}
export default MyComponent;