let numebrs =[10,20,30,40,50];
let [a,b,c,...d]=numebrs;
console.log(a);
console.log(b);
console.log(c);
console.log(d);

let person ={  fname:'tiya',age:5, gender:'female'};
let {fname,age,gender}=person;
console.log(fname);
console.log(age);
console.log(gender);

let address ={street:'cherry road',city:'salem',state:'tamil  nadu', zip :'636007'};
let employee ={ffname:'tiya', age1:12,gender1:'female',address};
let {ffname,age1,gender1,address:{city,state,zip}}=employee;
console.log(ffname);
console.log(age1);
console.log(gender1);
console.log(city);
console.log(state);
console.log(zip);

