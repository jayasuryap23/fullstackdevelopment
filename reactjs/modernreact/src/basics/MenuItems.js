function MenuItems(props)
{
    const item=  props.item;
    return <li key={item.toString()}>{item} </li>

}
function NavMenu1(props)
{
    const list =props.menuitems;
    const updatedList =  list.map((listItems)=>
    {
        return (
             <MenuItems item={listItems}/>
        )
    })
    return(
        <ul>{updatedList}</ul>
    )
}

export default NavMenu1;