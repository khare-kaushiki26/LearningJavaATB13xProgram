package encapsulation;

public class real_example{
    public static void main(String[] args) {
        // WE ARE ABLE TO ACCESS USERNAME AND PASSWORD BECAUSE IT IS PUBLIC --- WHICH IS A BAD PRACTICE
        VWOLogin vl =new VWOLogin();
        vl.creds();
        System.out.println(vl.age);
        GoodVWOLogin gvl = new GoodVWOLogin("kaushiki","khare");
        String username_fetched= gvl.getUsername();
        System.out.println("Old username : ");
        System.out.println(username_fetched);
        String password_fetched = gvl.getPassword();
        System.out.println("Old password : ");
        System.out.println(password_fetched);
        gvl.setPassword("KaushikiKhare");
        String password_fetched1 = gvl.getPassword();
        System.out.println("New password : ");
        System.out.println(password_fetched1);
        gvl.setUsername("Newuser");
        String username_fetched1= gvl.getUsername();
        System.out.println("New username : ");
        System.out.println(username_fetched1);


        // THIS WAY WE CANNOT ACCESS THE USERNAME AND PASSWORD BECAUSE IT IS MARKED AS PRIVATE IN GoodVWOLogin class
//        gvl.username;
//        gvl.password;
        // TO ACCESS OR MODIFY THE PRIVATE VARIABLES OF ANY CLASS , WE WILL USE GETTERS AND SETTERS FUNCTION


    }
}
