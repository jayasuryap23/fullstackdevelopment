//  call

function total(eng,mat)
{
    console.log(this.name+" got "+(eng+mat)+" marks")
}
const user ={name:'Ram'};
total.call(user,65,75);

//  apply

function total1(eng,mat)
{
  console.log(this.name+"got"+(eng+mat)+"marks")
}
const user1 ={name:'ram'}
total.apply(user,[65,75])

// bind
function total2(eng,mat)
{
  console.log(this.name+" got"+(eng + mat)+" marks");
}
const user2={name:'john'}
const fun = total2.bind(user2,67,78);
fun();
