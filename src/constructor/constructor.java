package constructor;
// Biggest advantage of Constructor in automation is, like in any test case where we want to have some prerequisite conditions met
// like reading some data from data base , fetching any file details from CSV file or text file or excel file
// before our test is executed , then at that time we perform all these actions inside the constructor
// so that as soon as the object of the class is created, the required conditions are met before hand and we would be available with the data
public class constructor {
    public static void main(String[] args) {
        baby b1= new baby();
    }

    static class baby {
        //Attribute : = means variables or Instance variable , data member , member variable
        String name;
        String dob;

        //Behavior : = means functions

        // default constructor : Same name as the class name
        baby() {
            System.out.println("your birth certificate is ready");

            // Fetch data from MySQL Database
            // Read some data from CSV file or XLSX file
            // Open a file and read data (json, txt file , testdata.xlsx)
        }

        void cry() {
            System.out.println("Cry");
        }

        void sleep() {
            System.out.println("Sleep");
        }

        void eat() {
            System.out.println("Eat");
        }
    }
}
