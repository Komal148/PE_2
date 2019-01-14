package com.stackroute.pe2;

/*Create a class named Member with Name, age, Salary as its variable, write an other class named Member Variable that creates an instance of the Member class, initialises its member variables, and then displays the value of each member variable.*/

public class MemberVariable {
    Member memberObject;
    MemberVariable() {
        memberObject = new Member();
    }
    String dispName(String name)
    {
        memberObject.setName(name);
        return memberObject.getName();
    }
    int dispAge(int age)
    {
        memberObject.setAge(age);
        return memberObject.getAge();
    }
    String dispSalary(String salary)
    {
        memberObject.setSalary(salary);
        return memberObject.getSalary();
    }
}

