package ex_02_variable_and_Literals;

public class Lab003_print_Statements {
    public static void main(String[] args) {
//        System.out.print(); --> This statement basically prints the content in a single line
//        System.out.println(); --> This statements is used to print content in new line . ln means new line
//        System.out.printf(); --> This is used to print string in a specific format
        System.out.println("My name is Kaushiki Khare");
        System.out.print("I am learning automation using java in selenium");
        System.out.println();
        String first = "Kaushiki";
        String last = "Khare";
        System.out.printf ("My name is %s %s", first, last);
    }
}
