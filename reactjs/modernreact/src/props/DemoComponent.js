import React,{ Component } from "react";

export default class DemoComponent extends Component
{
    render()
    {
        return(
            <React.Fragment>
                <h2> {this.props.user}</h2>
                <h3>welcome to reactjs props </h3>
            </React.Fragment>
        )
    }
}