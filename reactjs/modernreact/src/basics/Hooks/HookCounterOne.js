import React, { useState,useEffect } from "react";
export default function HookCounterOne()
{
    const [count, setCount]=  useState(0);

    useEffect(()=>
    {
        document.title ='you clicked ${count} times'
    },[])
    return(
        <React.Fragment>
            <button onClick={()=>setCount((prevCount)=>prevCount+1)}>Click {count}  times {" "}</button>
        </React.Fragment>

    )
}