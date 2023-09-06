//  asynchronous javascript 
// promises 
//  3 status  : pending, fulfilled ,  rejected 
// promise -  returns the status only  
/* const myPromise =  new Promise((resolve , reject)=>
{
    const error = false;
    if(!error)
    {
        resolve(" yes ! resolved the promise")
    }
    else{
        reject(" No! rejected the promise .")
    }
})

console.log(myPromise);
myPromise.then(value =>
    {
        return value +  welcome;
    })
    .then(status=>{
            console.log(status)
        })
        .catch(error=>{
            console.log(error)
        })


const myNewPromise =  new Promise((resolve,  reject)=>
{
    setTimeout(function(){
        resolve("my nextpromise  111  resolved")
    },3000)
})

myNewPromise.then(value=>
    {
        console.log(value)
    })

    myNewPromise.then((value)=>{
        console.log(value)
    }) */
//  fetch -  returns a promise 
/*     const users = fetch("https://jsonplaceholder.typicode.com/users")
    .then(response=>{
        return response.json()
    }).then(users=>
        {
            users.map(element => {
                console.log(element.address)
                
            });
        })
    

    console.log(users) */
    //  async await -  more then is not readbale 
    const myUsers={
        userList:[]
    }
    const user =async ()=>
    {
        const response = await fetch("https://jsonplaceholder.typicode.com/users")
        const userData = await  response.json()
        userData.map((element)=>
        {
            console.log(element.website)
        })
       // console.log(userData)
        return userData
       
    }
    user();

    const anotherFunction =  async ()=>
    {
        const data = await  user()
        myUsers.userList=data;
        return data; 
       // console.log(data)
    }
anotherFunction();
console.log(myUsers)
