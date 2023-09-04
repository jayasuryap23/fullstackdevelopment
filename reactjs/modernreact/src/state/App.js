import React,{Component} from "react";
class App  extends Component
{
    constructor(props)
    {
        super(props);
        this.state={count:0};
    }
    increment =()=>
    {
        this.setState((prevsate)=>
        ({ count:prevsate+1}))
    }
    decrement = ()=>
    {
        this.setState((prevsate)=>({
            count:prevsate-1

        }))
    }
    render()
    {
        return(
            <React.Fragment>
                <h1>The current count  is :{this.state.count}</h1>
                <button onClick={this.increment}>Increase</button>
                <button onClick={this.decrement}>Decrease</button>
            </React.Fragment>

        )
    }
}
export default App;