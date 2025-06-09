package ex_01_Java_Basic;

public class Lab002_Keywords_identifier_comment {
    public static void main(String[] args) {
        //This is a multiline comment.
       /* This program consists example of : keywords , identifiers
       and comment knowledge.
       Naming rules of an identifier :
       ---It should be alphanumeric and can only contain special characters like underscore and dollar signs
       ---It should begin with a letter (alphabet )
       ---Can begin with underscore (_) and dollar symbol ($)
       ---Rules for the case sensitivity is applicable
       ---Name (identifier)  should start with small alphabet
         */

//      Here are some print statements
//      The keywords are : package , public , class , static and void
        /* main is the name of the main method which is recognized by JVM */
        System.out.println("I can see a total of 5 keywords : package , public , class , static and void");
        System.out.println("I can see a total of 1 identifier which is the class name ");
//        Class name is nothing just the name by which the class can be identified
//        method overriding : When any 2 or more functions have the same name, it is called as method overriding
//        We can have more than one method with the name 'main' (just remember that String[]  args cannot be repeated
        /*

        Instead we can write two method definition lines as :
        public static void main (String[] args) {} ------ here the name of the method is main
        public static void main (int[] args) {} ----------here also the name of the method is main

        */
    }
}
