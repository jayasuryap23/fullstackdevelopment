let english  =95,tamil=98,maths=75;
let total,avg;
total=english+maths+tamil;
avg=total/3;
console.log("Total :"+total);
console.log("Average:"+avg);

if(english>=35 && tamil >=35 && maths>=35)
{
    console.log("Result:pass");

    if(avg>90 && avg<=100)
    {
        console.log("Grade:A grade");
    }
    else if (avg>80 && avg <=90)
    {
        console.log("Grade :B grade");
    }
    else if(avg>70 && avg<=80)
    {
        console.log("Grade:C grade");
    }
    else
    {
        console.log("Grade :D grade")
    }
}
else
{
    console.log("Result:Fail");
    console.log("grade:No  grade");
}