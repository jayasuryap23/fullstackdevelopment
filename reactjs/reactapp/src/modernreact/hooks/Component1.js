import { useState,useContext,createContext } from "react";

const UserContext = createContext();

function Component1()
{
    const[user,setUser] =  useState(" jesse Hall");
    return(
        <UserContext.Provider value={user}>
            <h1>{`hello ${user} `}</h1>
            <Component2/>
        </UserContext.Provider>
    )
}
function Component2()
{
    return(
        <>
        <h1>component 2 </h1>
        <Component3/>

        </>
    )
}
function Component3()
{
    return(
        <>
        <h1>component 3 </h1>
        <Component4/>


        </>
    )
}
function Component4()
{
    return(
        <>
        <h1>component 4 </h1>
        <Component5/>
        </>
    )
}
function Component5()
{
    const user =  useContext(UserContext);
    return(
        <>
        <h1>Component 5</h1>
        <h2>{`hello  ${user} again`}</h2>
        </>
    )
}
export default Component1