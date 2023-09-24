import { useState } from "react";
function Car()
{

    const [car,setCar]= useState({
        brand:'Ford',
        model:'Mustang',
        year:"1964",
        color:"red"
    });
    
    const updateColor = ()=>
    {
        setCar(previousState=>
            {
                return {...previousState, color:"blue"}
            });
    }





   /*  const[brand,setBrand] =  useState("ford");
    const[model,setModel] =  useState("Mustang");
    const[year,setYear]=useState("1964");
    const[color,setColor] =  useState("red"); */

    return(
        <>
        <h1>My {car.brand} </h1>
        <p> it is a {car.color}  {car.model} from {car.year} </p>
        <button type="button" onClick={updateColor}>Blue</button>
        </>
    )
}
export default Car;