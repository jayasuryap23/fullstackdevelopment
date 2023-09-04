import React, { useState } from "react";
function App1()
{
    const [click,setClick]=useState(0);
    return(
        <React.Fragment>
            <p>You clicked {click} times</p>
            <button onClick={()=>setClick(click+1)}>click me </button>
        </React.Fragment>

    )
}
export default  App1;