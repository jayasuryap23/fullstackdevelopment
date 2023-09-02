var a =25;
var b=35;
console.log(a+b);
//  scope (  in the scope we can redeclare the var )
if(true)
{
    var msg =  "welcome";
    var msg ="welcome to javascript";
    var  msg ="welcome to js";

}
console.log(msg)
// variable redeclaration
var a=25;
console.log(a);
var a=45;
console.log(a);
var a=25;
console.log(a);

let c=45;
console.log("before c is :"+c);

console.log("//////////////////////////");
c=50;
console.log("After c is :"+c);

// let c=24; variable let cannot be redeclared 
/* console.log("-------------------")
const d=34;
console.log("  before value of d is :"+d);
console.log("--------------------------");
d=45;
console.log("  reassigning of variable d is :"+d); */
//d=45;
//console.log(" after reassigning :"+d);

//  var - redeclare and reassign
//  let -  cannot redeclare and we can reassign
// const -  cannot redeclare and cannot reassign 