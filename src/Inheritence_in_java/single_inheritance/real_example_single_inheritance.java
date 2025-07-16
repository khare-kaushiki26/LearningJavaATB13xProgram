package Inheritence_in_java.single_inheritance;

// HERE IN THIS EXAMPLE , THIS CLASS HAS A MAIN METHOD WHERE THE OBJECT FOR ANOTHER CLASS IS CREATED WHICH IS Testcase1
// Testcase1 is extended from a class named common_to_all

public class real_example_single_inheritance {
    public static void main(String[] args) {
        Testcase1 t1 = new Testcase1();
        t1.runningTC1();
        Testcase2 t2=new Testcase2();
        t2.runningTC2();


        // THIS IS DYNAMIC DISPATCH where the reference of father class is
        common_to_all c1 = new common_to_all();
        common_to_all c2 = new Testcase1();
        common_to_all c3 = new Testcase2();
    }
}
