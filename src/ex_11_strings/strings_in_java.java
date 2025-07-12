package ex_11_strings;

public class strings_in_java {
    public static void main(String[] args) {
        String name = "Kaushiki"; // This gets assigned to the string constant pool
        name.toLowerCase(); // Converting the string to the upper case without reassigning
        System.out.println(name); // printing the name --> This prints the initial value of the name as there is changes made by converting it into lower case but the reassignment is not done
//         the above print statement proves that the string is immutable
        name = name.toUpperCase(); // reassignment of the name is done after making changes to the string by converting it into upper case
        System.out.println(name); // The name is printed with the changed value because the reassignment has been done
        String first = "Kaushiki ";
        String last = "Khare";
        String full_name = first.concat(last);
        System.out.println(full_name);



    }

}
