import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch, Redirect} from 'react-router-dom';

class App extends Component {
  render() {
    return (
      <div className="App">
          const App = () => (
          <Router>
              <div>
                  <AppNavigation/>
                  <Switch>
                      <Route exact path="/" component={Index}/>
                      <Route path="/first" component={One}/>

                      <Redirect from="/notinuse" to="/first"/>
                      <Route component={NotFound}/>
                  </Switch>
              </div>
          </Router>
          )
      </div>
    );
  }
}

export default App;
