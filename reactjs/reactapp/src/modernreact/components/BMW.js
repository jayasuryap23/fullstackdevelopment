function BMW({brand,color,name,model,seater})
{
    return ( 
        <>
            <h2> hey this is {brand}, {color} 7 series  </h2>
            <h3> the brand is {name} and model is {model} and seater is {seater}</h3>
        </>

    )
}

function Garage()
{
    const carinfo={
        name:'ford',
        model:"mustang",
        seater:7
    }
    const color="red";
    return(
        <>
        <h1>who lives in my Garage?</h1>
        <BMW brand="bmw" color={color} carinfo={carinfo} />
        </>
    )
}
export default Garage;