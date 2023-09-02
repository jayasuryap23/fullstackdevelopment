let fname='good';
let lname='morning'
let full_name;
//  concatenation  ( append )
full_name = fname +" "+ lname;
console.log(full_name)

//  concat
full_name= fname.concat('',lname)
console.log(full_name)

// Append
c='good '
c+='morning'
console.log('append :'+c);

// escaping
c="he cant't help your teams "
console.log(c);

// length 
c=full_name.length;
console.log('length :',c);

//  change case 
c=fname.toUpperCase();
console.log('uppercase is :'+c)

c=lname.toLowerCase();
console.log("lower case is :",c)

c=fname.indexOf('g')
console.log('index of g is ',c)

c=lname.lastIndexOf('n')
console.log('index of n ',c)


c= fname.charAt(3)
console.log('charAt 1 :'+c);;

console.log("------------------------------------")
let firstname='goodmorning';
let first=firstname.substring(4,0); //  0 - n-1 //  after 4 
console.log(first)

//  slice 
let text ="123456789";
t =text.slice(2,6)
console.log(t);

let hope =' i have hope in me soon i will  get a job in good mnc';
let time = hope.split(" ")
console.log("split method :",time);
console.table(time);

//  replace 
let hometown = 'im from harur';
console.log('before replace :'+ hometown);
let currentplace =  hometown.replace('harur','chennai')
console.log("after replace :"+currentplace);

//  includes in js 

const languages =['c','c++','java','python'];
console.log(languages.includes('nodejs'));
console.log(languages.includes('java'));


//  trim
let a=" good    morning      have  a nice  day";
console.log("before trim",+a.length);
a=a.trim();
console.log("after trim ::",a.length)

//  long literal
let longstring ="  hi good morning my name is p.jayasurya "+" i am from chennai i have completed "+
" my bachelor of technology in information technology";
console.log(longstring)

 longstring =  " hi  im placed in \ devon technologies \ in chennai \  i should win definitely \ not immediately";
console.log(longstring)

