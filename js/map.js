const numbers =[1,2,3,4,5,6,7,8,9,10];
let even = numbers.map((value)=>
{
    return value%2==0;
})
console.log(even);

const users =[
    {name:'sam',age:15,city:'chennai',salary:10500},
    {name:'ravi',age:22,city:'namakkal',salary:12000},
    {name:'joes',age:18,city:'hosur',salary:6000},
    {name:"aureen",age:47,city:'dharmapuri',salary:10000},
    {name:'Stanley',age:10,city:'salem',salary:8000},
    {name:"ram",age:12,city:'salem',salary:10000}
];
console.table(users)

const number =  [1,2,3,4,5,6,7,8,9,10];
//  slice (start,end)
console.log(number);

console.log('slice :'+number.slice(2,4))// 34 

//  spilce -  changes the original  array 
const n1=[1,2,3,4,5,6,7,8,9,10];
console.log("before splice :"+n1);

let removed =  n1.splice(2,2);
console.log("removed items :"+removed);
console.log("after splice :"+n1);

//  concat
const a =[10,20,30];
const b =[40,50,60];
const c =[70,80,90];

let d =a.concat(b);
console.log(d);

//  sort
const names =['kumar','aureen','joes','zara','stanley'];
console.log("before sort:"+names);

names.sort();

console.log("after sort :"+names);

//  fill 
let n =[1,2,3,4,5,6];
console.log("before fill :"+n);
n.fill(20,3,5);
console.log("after fill :"+n);

//  includes 
const products =['pen','pencil','eraser','box','pen'];
let result =  products.includes("pen");
console.log(result);

result =  products.includes("scale"); 
console.log(result);

result=  products.includes("pencil",2);
console.log(result);

// join
console.log(products.join('||'));
console.log(products.reverse());

const values =[1,2,3,4,5];
console.log("before reverse :"+values);
values.reverse();
console.log("after reverse :"+values);
console.log("-----------------------")

//  push 
let languages =['c','c++'];
console.log("before push :"+languages);
languages.push('java','python');
console.log("after push :"+languages)

let frameworks =  ['angular js'];
frameworks.unshift('react js ','next js');
console.log(frameworks);
frameworks.unshift('next js ');
console.log("after shift "+frameworks);
console.log(frameworks);

frameworks.shift('next js');
frameworks.pop('next js');

console.log(frameworks);
frameworks.pop('next js');
console.log(frameworks)

// merging 2 arrays 
let fruits1 =['apple','banana','mango'];
let fruits2 =['grapes','pineapple','papaya'];

fruits1.push(... fruits2);
console.log(fruits1);


let fruit = fruits1.indexOf('mango');
console.log(fruit);

let ft =  fruits1.lastIndexOf('papaya');
console.log(ft);