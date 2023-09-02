let numbers =[1,2,3,4,5,6,7,8,9,10];
let evenNumbers =  numbers.filter(number=>number%2==0);
console.log(evenNumbers);

// 
let user =[
    {name:'Alice',age:25},
    {name:'bob',age:30},
    {name:'charlie',age:35}

]
let eligible = user.filter(user=>user.age>30)
console.log(eligible);

let words =['cat','dog','elephant','fish','giraffe'];
let wordswith4letters =  words.filter(word=>word.length===4);
console.log(wordswith4letters);

let number =[1,2,3,4,5,6,7,8,9,10];
let numdiv =  number.filter(number=>number%3==0)
console.log(numdiv)

