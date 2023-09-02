let a=[10,20,30,40];
console.log(a);
console.table(a);
console.log(a[1])

let b =  new Array(10,20,30,40);
console.table(b)

let c =  new Array("surya",22,true,
{
    m1:100,
    m2:75,
    m3:65
})
console.table(c)

const number =[1,2,3,4,5,6,7,8,9,10];
//  value,  index, array
number.forEach((value)=>
{
    console.table(value);
})

number.forEach((value,index)=>
{
    console.table("index :"+index+" value :"+value);
});

const users=[
    {fullname:'jayasurya',age:22,city:'chennai',salary:25000},
    {fullname:'shiva',age:23,city:'coimbatore',salary:100000},
    {fullname:'govinda',age:25,city:'tirupati',salary:150000},
    {fullname:'lakshmi',age:23,city:'tirupati',salary:300000},
    {fullname:'parvathi',age:22,city:'madurai',salary:250000}
];
console.table(users);

users.forEach((value)=>
{
    console.table(`${value.fullname}  ${value.age}`)
})