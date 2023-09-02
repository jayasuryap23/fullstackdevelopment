const user ={
    name:'tiya',
    age:10,
    job:'programmer'
};
for(let key in user)
{
    console.log(`${key}: ${user[key]}`)
}