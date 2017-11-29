import React, { Component } from 'react';
import './App.css';
import Lomake from "./Lomake";
import LomakeTiedot from "./LomakeTiedot";

class App extends Component {

    lomakeValmis = (data) => {this.setState(data);}

  render() {
    return (
      <div className="App">
          <Lomake callback={this.lomakeValmis}/>
          {this.state?<LomakeTiedot hlo={this.state}/>:<LomakeTiedot/>}

      </div>
    );
  }
}

export default App;
