import logo from './logo.svg';
import { Component } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello = () => {
    alert('Hello Member !');
  }

  sayWelcome = (message) => {
    alert(message);
  }

  onPress = (e) => {
    alert('I was clicked');
  }

  render() {
    return (
      <div className="App">
        <h1>{this.state.counter}</h1>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <button onClick={() => this.sayWelcome('welcome')}>Say welcome</button>
        <button onClick={this.onPress}>Click on me</button>
        
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
