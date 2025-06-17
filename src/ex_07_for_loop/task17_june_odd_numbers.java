package ex_07_for_loop;

public class task17_june_odd_numbers {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=50; i++)
        {
//            we are skipping the even numbers
            if (i%2==0 ) {
                continue;
            }
            else{
                System.out.println(i+ " is odd");
            }
        }
    }
}
