function Audi(props)
{

    return( <li> i am a {props.brand} </li>
    )
}

function Garage()
{
    const cars =['ford','bmw','audi'];
    return(
        <>
        <h1>who lives in my garage?</h1>
        <ul>
            {cars.map((car)=><Audi brand={car}/>)}
        </ul>
        </>
    )
}