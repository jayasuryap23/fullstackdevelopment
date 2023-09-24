import {useState} from 'react';
import Todos from './Todos';
const App=()=>
{
    const[count,setcount]= useState(0);
    const [todos,setTodos] =  useState(["todo 1","todo 2"]);

    const increment = ()=>
    {
        setcount((c)=>c+1);
    }
    return(
        <>
        <Todos todos={todos}/>
        <hr/>
        <div>
            count:{count}
            <button onClick={increment}>+</button>
        </div>
        </>
    )
}
export default App;