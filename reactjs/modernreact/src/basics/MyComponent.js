 import React,{Component} from "react";
class MyComponent extends Component
{
    constructor()
    {
        super();
        this.sate =  {sayings:''};
        

    }
    update(e)
    {
        this.setState({sayings:e.target.value})
    }
    render()
    {
        return(
            <React.Fragment>
                Mukul  says <input type="text" onChange={this.update.bind(this)}/>
                <br/>
                <em>{this.state.sayings}</em>
            </React.Fragment>
        )
    }
    
}
export default MyComponent;