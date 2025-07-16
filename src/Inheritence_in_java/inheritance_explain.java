package Inheritence_in_java;

public class inheritance_explain {
    public static void main(String[] args) {
        Father f1=new Father();
        son s1=new son();
        System.out.println("Gold possessed by father : called by object of father class");
        System.out.println(f1.gold_possessed);
        System.out.println("BHK owned by Father : called by object of father class");
        f1.bhk();

        System.out.println("Gold possessed by father : called by object of son class ");
        System.out.println(s1.gold_possessed);
        System.out.println("BHK owned by Father : called by object of son class");
        s1.bhk();
        System.out.println("BHK owned by Son : called by object of son class ");
        s1.bhkson();
    }
}
class Father {
    int gold_possessed = 18; //ATTRIBUTE , DATA VARIABLE, MEMBER VARIABLE, INSTANCE VARIABLE
    void bhk()// BEHAVIOR , METHOD, FUNCTION ,
    {
        System.out.println("Father has a 2 BHK house");
    }
}
class son extends Father {
    // extends keyword is used to show inheritence
    // Also, son extends Father means all the attributes and behavior of the class Father
    // is available for class son to use
    // we can create object of both the class in main method
    // the object of son class can access attributes/ behavior of Father class by using dot operator
    int age =25;
    void bhkson()
    {
        System.out.println("Son has 4 BHK house");
    }

}
