package ex_11_strings;

public class String_functions {
    public static void main(String[] args) {
        String str = "I am a Quality Assurance Engineer.";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(" And I worked at Builder"));
        System.out.println(str.length());
        System.out.println(str.charAt(7));
        System.out.println(str.chars());
        String s1 ="madam";
        System.out.println(s1.lastIndexOf("m"));
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.contains("am"));
        System.out.println(s1.length());
        System.out.println(s1.replace("m","d"));
        String email = "kaushikikhare@gmail.com";
        String[] email_after_split = email.split("i");
        System.out.println(email_after_split);
        String name2 = "Somany Tiles";
        System.out.println(name2.endsWith("s"));
        System.out.println(name2.endsWith("d"));
        System.out.println(name2.startsWith("2"));
        System.out.println((name2.startsWith("S")));
        System.out.println(email.substring(4,20));


    }
}
