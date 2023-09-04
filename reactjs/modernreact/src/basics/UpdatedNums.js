import React from "react";
import { ReactDOM } from "react";
const numbers =[1,2,3,4,5];

const UpdatedNums =  numbers.map((number=>
    {
        return <li> {number}</li>
    }));
    
    ReactDOM.render(
        <ul>
            {UpdatedNums}
        </ul>
    )
    export default UpdatedNums;