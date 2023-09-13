import { useEffect } from "react"

function FetchData()
{
    useEffect( ()=>{
        const fetchItems =  async ()=>{
            try
            {
                const response = await fetch("https://jsonplaceholder.typicode.com/users")
                const data =await response.json()
                console.log(data)
            }
            catch(err)
            {
                console.log(err)
            }
        }
        fetchItems()
    },[])
  //  fetchItems()

    return(
        <p>{fetchItems ()}</p>

    )
}
export default FetchData
