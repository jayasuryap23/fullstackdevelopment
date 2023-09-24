function Football()
{
    const shoot=(a)=>
    {
        alert(a);
    }
    return(
        <>
        <button onClick={()=>{shoot("goal!")}}>Take the Shot!</button>
        </>
    )
}
export default  Football;