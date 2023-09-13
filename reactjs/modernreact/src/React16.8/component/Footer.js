

const Footer = ({length}) => {
  return (
    <div>
      <footer> {length} List {length>1?"items":"item"} </footer>
    </div>
  )
}

export default Footer