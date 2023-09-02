let a;
a=35;
console.log(a,typeof a);
a=String(35);
console.log(a,typeof a);
b=parseInt(a);
console.log(b,typeof b);
a=String(b);
console.log(a, typeof a)

a=[1,2,3,4,5];
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

let f;
f=[1,2,3,4,5];
console.log(typeof f,f);
f=parseInt(f)
console.log("parseint ",typeof f,f)
console.log("--------------------------")

var c="1234";
console.log(c,typeof c);
c=Number(c);
console.log(c,typeof c);

console.log("-------------------------")

c="35.55";
console.log(c,typeof c);
c=45.56;
console.log(c,typeof c);
c=parseFloat(c);
console.log("--------------")
console.log(c,typeof c)