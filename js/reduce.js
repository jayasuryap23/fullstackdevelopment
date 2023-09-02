//  previous value ,  current value , current index , array

let numbers =[1,2,3,4,5];
let sum  =  numbers.reduce((previousvalue,number)=>
{
    return previousvalue+number;
})
console.log(sum);

//  flattening array
let nestedArray =[[1,2],[3,4],[5,6]];
let flattenedArray  =  nestedArray.reduce((accumulator,currentvalue)=>
{
    return accumulator.concat(currentvalue);
})
console.log(flattenedArray);

let colors =['red','blue','green','red','blue','yelloe'];
let colorCount =  colors.reduce((accumulator,currentvalue)=>
{
    if(currentvalue in accumulator)
    {
        accumulator[currentvalue]++;
    }
    else
    {
        accumulator[currentvalue]=1;
    }
    return accumulator
},{});
console.log(colorCount);

let num =[5,10,15,20,25];
let largest = num.reduce((accumulator,currentvalue)=>
{
    return Math.max(accumulator,currentvalue);
})
console.log(largest);

let people =[
    {name:'rakesh',age:25,city:'chennai'},
    {name:"raj",age:30,city:'salem'},
    {name:'sara',age:35,ciy:'chennai'}
]

let groupedBycity =  people.reduce((accumulator,currentvalue)=>
{
    if(currentvalue.city in accumulator)
    {
        accumulator[currentvalue.city]=[currentvalue]
    }
    return accumulator;
},{});
console.log(groupedBycity);
