function NavMenu(props)
{
    const list = props.menuitems;
    const updatedList =  list.map((listItems)=>
    { 
        return <li>{listItems}</li>

     })
     return(
        <ul>{updatedList}</ul>
     )

}
export default NavMenu;