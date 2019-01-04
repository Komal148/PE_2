public class MemberVariable {
    Member m1;
    MemberVariable() {
         m1 = new Member();
    }
    String dispName(String name)
    {
        m1.setName(name);
        return m1.getName();
    }
    int dispAge(int age)
    {
        m1.setAge(age);
        return m1.getAge();
    }
    String dispSalary(String salary)
    {
        m1.setSalary(salary);
        return m1.getSalary();
    }
}

