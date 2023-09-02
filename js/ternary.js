// ( condition )?"true":"false"
const age =22;
const result =(age>18)?"eligible ":"not eligible";
console.log(result);

function welcome(name)
{
    const result =  name?name:'No Name';
    console.log("welcome "+result)
}
welcome();
welcome(null);
console.log("good morning")

user ={'name':'surya','age':22}
console.log(user)
console.log(user.name)

const greeting=(user)=>
{
    const name =  user.name ?user.name:'No name';
    return 'Hello '+ name
}
console.log(greeting(user))

//  conditional  chains

const avg=79;
const grade =avg>=90?"a grade":"B grade";
console.log(grade)

