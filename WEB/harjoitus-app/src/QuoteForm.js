import React, {Component} from 'react';


class QuoteForm extends Component {
    constructor(props) {
        super(props);
        this.state = { nimi: '', virsi: '' }
    }

    onSubmit = (event) => {
        event.preventDefault();
        if (this.props.callback) {
            this.props.callback(this.state);
            this.setState({"nimi": "", "virsi": ""});
        }

        };

    render() {
        return (<div>
                <form>
                    <p>
                        <label htmlFor="form_quotetext">Sanonta</label>
                        <textarea type="text" placeholder="quote" id="form_quotetext"
                                  value={this.state.virsi} onChange={e => this.setState({virsi: e.target.value})}
                                  required="required"></textarea>
                    </p>

                    <br></br>
                    <p>
                        <label htmlFor="form_author">Sanoja</label>
                        <input type="text" placeholder="Name" id="form_author"
                               value={this.state.nimi} onChange={e => this.setState({nimi: e.target.value})}/>
                    </p>
                    <p><input type="submit" value="Create" onClick={this.onSubmit}/></p>

                </form>
            </div>

        );
    }
}

export default QuoteForm;