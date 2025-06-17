package ex_07_for_loop;

public class task_17_june_even_num_1to50 {
    public static void main(String[] args) {
//        Even numbers between 1-50
        int i;
        for (i=1; i <= 50 ; i++)
        {
            if(i%2==0) {
                System.out.println("The number " + i + " is even");
            }
            else { continue;}
        }
    }
}
