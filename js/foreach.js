const fruits =['apple','banana','cherry'];
fruits.forEach((fruit)=>console.log(fruit));

const numbers =[1,2,3,4,5];
let total=0;
numbers.forEach((number)=>
{
    total+=number;
})

console.log(total);

//
 const number =[1,2,3,4,5];
 const doubleNumbers =  [];
 number.forEach((number)=>
 {
    doubleNumbers.push(number * 2)
 });
 console.log(doubleNumbers);

 const num=[1,2,3,4,5];
 let sum=0;
 let count=0;
 num.forEach((number)=>
 {
    sum+=num;
    count++;
 })
 console.log(total/count);

 const n =[1,2,3,4,5,6,7,8,9,10];
 const evenNumbers =[];
 n.forEach((number=>
    {
        if(number %2==0)
        {
            evenNumbers.push(number)
        }
    }))
    console.log(evenNumbers);

const  names =['john','mike','bob','jane'];
names.forEach((name,index)=>
{
    names[index]= name.toUpperCase();
});
console.log(names);

