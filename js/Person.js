class Person
{
    constructor(name)
    {
      this.name=name;
    }
    sayHello()
    {
        console.log(`hello , my name is ${this.name}`)
    }
}
class Student extends Person
{
    constructor(name,age)
    {
        super(name);//  calling parent class constructor instance
        this.age=age;
    }
    eligibility()
    {
        console.log(this.name+"age is "+this.age+" "+(this.age>=18?"Eligible":"Not Eligible"));
    }
}

let person =  new person('govinda');
let student = new student("lakshmi",30);

person.sayHello();
student.eligibility();
student.sayHello();
