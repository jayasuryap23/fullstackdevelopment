let user={
    name:"surya",
    age:22,
    city:'chennai',
    contact:'987654321'
};
// converting object into arrays 

let keys =  Object.keys(user);
console.log(keys);

let values =  Object.values(user);
console.log(values);

for(let i=0;i<keys.length;i++)
{
    console.log(keys[i]+" "+values[i]);
}