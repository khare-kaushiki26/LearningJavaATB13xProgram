package constructor;

public class real_example_of_constructor {
    public static void main(String[] args) {
        webAutomation ob1 = new webAutomation();
    }
}
class webAutomation{
    webAutomation()
    {
        System.out.println("I want to read a csv file");
        System.out.println("I want to perform the page loading action before the test script runs");
        System.out.println("we can write and perform whatever actions are required in default constructor");
        System.out.println("Whenever the object of this class would be created , all the statements of default constructor would be executed");

    }
}
