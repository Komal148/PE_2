public class MemberVariable {
    String dispName(String name)
    {
        return name;
    }
    int dispAge(int age)
    {
        return age;
    }
    String dispSalary(String salary)
    {
        return salary;
    }
    public static void assignValue() {
        Member m1 = new Member();
        m1.name = "Harry Potter";
        m1.age = 30;
        m1.salary = "2500.3";


//        Member m1 = new Member();
//        m1.name = "Harry Potter";
//        m1.age = 30;
//        m1.salary = 2500.3;
//        MemberVariable mv = new MemberVariable();
//        mv.dispName(m1.name);
//        mv.dispAge(m1.age);
//        mv.dispSalary(m1.salary);
    }
}

