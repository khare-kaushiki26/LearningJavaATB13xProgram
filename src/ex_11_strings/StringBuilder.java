package ex_11_strings;

public class StringBuilder {
    public static void main(String[] args) {
       java.lang.StringBuilder sb1 = new java.lang.StringBuilder("Kaushiki");
        System.out.println(sb1);
        sb1.append(" Khare");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        sb1.delete(2,4);
        System.out.println(sb1);
        sb1.replace(1,3,"KKKKKKK");
        System.out.println(sb1);
    }
}
