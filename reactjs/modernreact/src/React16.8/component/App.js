import Content from "./Content";
import Footer from "./Footer";
import Header from "./Header";
import '../component/App.css';
import React,{useState} from "react";
function App()
{
    const [items,setItems]=useState(
        [
        {id:1,checked:true,item:'practice coding'}
        ,
        {
          id:2,
          checked:false,
          item:'playing cricket'
        },
        {
          id:3,
          checked:true,
          item:'Read about Chat GPT'
        }])
    
        const handleCheck = (id)=>
        {
          const listItems= items.map((item)=>item.id===id ?{ ...item ,checked:!item.checked}:item)
          setItems(listItems)
          localStorage.setItem("todo_list",JSON.stringify(listItems))
    
        }
        const handleDelete =(id)=>
        {
          const listItems= items.filter((item)=>item.id!==id)
          setItems(listItems)
        }
        
    return(
        <div className="App">
            <Header  title=" Add to Cart" />
            <Content
            items={items}
            handleCheck={handleCheck}
            handleDelete={handleDelete}
            />
            <Footer  length = {items.length} />
        </div>
    )
}

export default App;