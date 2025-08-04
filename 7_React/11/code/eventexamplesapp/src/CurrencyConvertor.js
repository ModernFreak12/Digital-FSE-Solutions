import { Component } from 'react';
class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            amount: '',
            currency: ''
        };
    }

    handleAmountChange = (e) => {
        this.setState({ amount: e.target.value });
    }

    handleCurrencyChange = (e) => {
        this.setState({ currency: e.target.value });
    }

    handleSubmit = (e) => {
        e.preventDefault();
        const euroAmount = this.state.amount * 90; 
        alert(`Converting to Euro Amount is ${euroAmount.toFixed(2)}`);
    }

    render() {
        return (
        <div>
            <h2 style={{color: 'green'}}>Currency Convertor!!!</h2>
            <form onSubmit={this.handleSubmit}>
            <div>
                <label>Amount: </label>
                <input 
                type="text" 
                value={this.state.amount}
                onChange={this.handleAmountChange}
                />
            </div>
            <br />
            <div>
                <label>Currency: </label>
                <input 
                type="text" 
                value={this.state.currency}
                onChange={this.handleCurrencyChange}
                />
            </div>
            <br />
            <button type="submit">Submit</button>
            </form>
        </div>
        );
    }
}

export default CurrencyConvertor;