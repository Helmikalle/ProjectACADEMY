import React, { Component } from 'react';
// import logo from './logo.svg';
import './App.css';
import Lomake from './Lomake';

class App extends Component {

    lomakeValmis = (hlo) => {
        this.setState();
    };
  render() {
    return (
      <div className="App">
          <Lomake kutsuttava={this.lomakeValmis}/>

      </div>
    );
  }
}

export default App;
