function add(a,b)
{
    return a+b;
}
let result = add(3,5);
console.log(result);
//  1.using arrow functions with map
let numbers =[1,2,3,4,5];
let doubleNumbers =  numbers.map(number=>number * 2);
console.log(doubleNumbers);

//  2 .using arrow functions with filter 
let words =  ['apple','banana','orange','grape'];
let filteredwords =  words.filter(word=>word.length>5);
console.log(filteredwords);

//  3. using arrow functions with reduce 
//  previous value ,  current value ,  current index ,array
let number =[1,2,3,4,5];
let total =  number.reduce((sum,number)=>
{
    return sum + number;
})
console.log(total);

