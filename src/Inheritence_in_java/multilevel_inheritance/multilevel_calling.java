package Inheritence_in_java.multilevel_inheritance;
// lecture 2 july
public class multilevel_calling {
    public static void main(String[] args) {
        // object of whichever class is created , the behavior will also be of same class
        grandfather_class gf1 = new grandfather_class();
        System.out.println("The functions of grandfather class is called");
        gf1.money();
        gf1.home();

        // object of whichever class is created , the behavior will also be of same class
        father_class f1=new father_class();
        System.out.println("The function of the father class is called");
        f1.home();
        f1.money();

        // object of whichever class is created , the behavior will also be of same class
        son_class s1 = new son_class();
        System.out.println("The function of the son class is called");
        s1.home();
        s1.money();

        // object of whichever class is created , the behavior will also be of same class
        grandfather_class gf2=new father_class();
        System.out.println("The function of the father class is called with the reference of grandfather class");
        gf2.home();
        gf2.money();
    }
}
