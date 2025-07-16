package constructor;

// this keyword is a reference variable which is used to refer to any instance variable within an instance method or constructor
// this keyword can only be used with instance methods or constructors
public class constructor_overloading {
    public static void main(String[] args) {
        // calling attributes of the default constructor upon object creation
        System.out.println("1) : Calling attributes of the default constructor upon object creation");
        Student s1= new Student();
        // this is called constructor overloading
        // where the constructor is created having same name as the class name but the parameters are different
        Student s2=new Student(26,12,99,"Vibha");
        Student s3=new Student(56,23);
        // calling attributes of a parameterized constructor having all the parameters
        System.out.println("2) : Calling attributes of a parameterized constructor having all the parameters");
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s2.rollno);
        System.out.println(s2.standard);
        // Calling the attributes of another parameterized constructor where only 2 parameters are passed at object creation time
        System.out.println("3) :Calling the attributes of another parameterized constructor where only 2 parameters are passed at object creation time");
        System.out.println(s3.marks);
        System.out.println(s3.rollno);
        System.out.println(s3.name); // it is printing num because there is no name assigned

    }
}
class Student
{
    int rollno;
    int standard;
    String name;
    int marks;

    //DC
    Student()
    {
        rollno=10;
        standard =12;
        name = "unknown";
        marks=98;
        System.out.println(rollno);
        System.out.println(standard);
        System.out.println(name);
        System.out.println(marks);
    }
    Student(int roll,int std,int mark,String name_user)
    {
        this.name=name_user;
        this.rollno=roll;
        this.standard=std;
        this.marks=mark;
    }

    Student(int m,int r)
    {
        this.marks=m;
        this.rollno=r;
    }
}

