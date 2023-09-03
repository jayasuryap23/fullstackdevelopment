let brand =  document.getElementById("brand");
console.log(brand);
brand.style.backgroundColor="purple";
brand.style.color="red";

let stitle =document.getElementsByClassName("sub-title");

console.log(stitle);

stitle[0].style.color="red";
stitle[1].style.color="green";

stitle.foreach((element)=>
{
    element.style.color="green";
})

for(let i=0;i<stitle.length;i++)
{
    stitle[i].style.color="blue";
}

let para =document.getElementsByTagName("p");
console.log(para);

for(let i=0;i<para.length;i++)
{
    para[i].style.color="purple";
}

let heading = document.querySelector("h1");
console.log(heading);

heading.style.color="orange";
let qpara=  document.querySelectorAll("p");
console.log(qpara);
qpara.forEach((element)=>
{
    element.style.color="blue";
})
