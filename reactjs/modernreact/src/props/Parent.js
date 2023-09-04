import React,{Component} from "react";
class Parent extends Component
{
    render()
    {
        return(
            <React.Fragment>
                <h1>you are inside parent component </h1>
                <Child name="user" userId='1777' />
            </React.Fragment>
        )
    }
}
class Child extends Component
{
    render()
    {
        return(
            <React.Fragment>
                <h2>Hello, {this.props.name}</h2>
                <h3>your user id is :{this.props.userId}</h3>
            </React.Fragment>
        )
    }
}
export default Parent;