package com.stackroute.pe2;

/*Create a class named Member with Name, age, Salary as its variable, write an other class named Member Variable that creates an instance of the Member class, initialises its member variables, and then displays the value of each member variable.*/

public class Member {
    private String name;
    private int age;
    private String salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
