package constructor;

public class parameterized_constructor_use {
    public static void main(String[] args) {
        // creating object for a parameterized constructor , where we need to give parameters while object creation
        Baby b1= new Baby("Shona",8,10,2023);
        System.out.println(b1.name);
        System.out.println(b1.day);
        System.out.println(b1.month);
        System.out.println(b1.year);
        // Creating object for default constructor
        Baby b2= new Baby();

    }
}
class Baby
{
    String name;
    int day;
    int month;
    int year;

    Baby()
    {
        day=2;
        month = 3;
        year= 2024;
        name = "ABC";
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(name);
    }

    Baby(String baby_name, int baby_day,int baby_month, int baby_year)
    {
        this.name=baby_name;
        this.year =baby_year;
        this.day =baby_day;
        this.month=baby_month;
    }
}
