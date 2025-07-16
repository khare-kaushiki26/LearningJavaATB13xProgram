package Abstaction;

public class example_abstraction {
    public static void main(String[] args) {
        //Employee e = new Employee();// Cannot be used because it is incomplete
        Company c = new Company();
        double sal= c.payment();
        System.out.println("Salary is "+ sal);
    }
}

abstract class Employee
{
    private String name;
    private String address;
    private int number;

    Employee()
    {
        System.out.println("DC");
    }
    Employee(String n, String a,int num)
    {
        System.out.println("Creating Employee data");
        this.name=n;
        this.address=a;
        this.number=num;
    }
    abstract double payment();

    void sendmail()
    {
        System.out.println("Sending email to "+ this.name);
    }
}

class Company extends Employee
{
    @Override
    double payment ()
    {
        return 1000.0;
    }
}