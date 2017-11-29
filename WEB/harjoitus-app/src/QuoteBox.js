import React, { Component } from 'react';
import QuoteList from './QuoteList';
import QuoteForm from './QuoteForm';

let data1 =
    [
        {
            "id": 1,
            "nimi": "Benjamin Franklin",
            "virsi": "An investment in knowledge pays the best interest."
        },
        {
            "id": 2,
            "nimi": "Herbert Spencer",
            "virsi": "The great aim of education is not knowledge but action."
        },
        {
            "id": 3,
            "nimi": "Nelson Mandela",
            "virsi": "Education is the most powerful weapon which you can use to change the world."
        },
        {
            "id": 4,
            "nimi": "Mark Twain",
            "virsi": "Don't let schooling interfere with your education."
        },
        {
            "id": 5,
            "nimi": "Albert Einstein",
            "virsi": "The difference between stupidity and genius is that genius has its limits."
        },
        {
            "id": 6,
            "nimi": "Leonardo da Vinci",
            "virsi": "Poor is the pupil who does not surpass his master."
        },
        {
            "id": 7,
            "nimi": "Douglas Adams",
            "virsi": "A common mistake that people make when trying to design something completely foolproof is to underestimate the ingenuity of complete fools."
        }
    ];

class QuoteBox extends Component {
    constructor(props) {
        super(props);
        this.state = {data: data1, lastid: data1.length + 10};
    }
    handleQuoteAdded = (nq) => {
        nq.id = this.state.lastid++;
        this.state.data.push(nq);
        this.setState(this.state);
    }
    render() {
        return (
            <div className="quotebox">

                <h1>Sanonnat</h1>
                <QuoteForm callback={this.handleQuoteAdded}/>
                <QuoteList sanonnat={this.state.data}/>
            </div>
        );
    }
}
export default QuoteBox;