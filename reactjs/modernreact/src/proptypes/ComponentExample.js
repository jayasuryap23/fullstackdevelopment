import React,{Component} from "react";
class ComponentExample extends Component
{

    render()
    {
        return(
            <React.Fragment>
                <h1> 
                    <br/>
                    <br/>
                    <br/>
                </h1>
            </React.Fragment>
        )
    }
}

// validating prop types 
ComponentExample.propTypes={
    arrayProp:propTypes.array,
    stringProp:propTypes.string,
    numberProp:propTypes.number,
    boolProp:propTypes.bool

    
}
// creating default props
ComponentExample.defaultProps={
    arrayProp:['Ram','Shyam','Raghav'],
    stringProp:'Geeks',
    numberProp:'10',
    boolProp:true,
}
export default ComponentExample;