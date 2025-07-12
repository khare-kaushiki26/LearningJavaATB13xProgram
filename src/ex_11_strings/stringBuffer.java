package ex_11_strings;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("Kaushiki");
        System.out.println(sb);
        sb.append(" Khare");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
