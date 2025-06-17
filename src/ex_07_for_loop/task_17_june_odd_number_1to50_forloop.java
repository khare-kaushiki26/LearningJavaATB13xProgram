package ex_07_for_loop;

public class task_17_june_odd_number_1to50_forloop {
    public static void main(String[] args) {
//        odd numbers using for loop
        for (int i=1; i <= 50; i++)
        {
          if(i%2 !=0)
          {
              System.out.println(i+ " is odd");
          }
          else {
              continue;}
          }
        }
    }


