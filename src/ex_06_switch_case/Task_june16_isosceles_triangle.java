package ex_06_switch_case;
import java.util.Scanner;
public class Task_june16_isosceles_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter the three lengths : ");

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        //Equilateral triangle : All three sides equal :
        // isosceles triangle :  2 sides equal length
        // scalene triangle : none of the sides are equal
        if (l1 == l2)
        {
            if (l1 == l3) {
                System.out.println("It is an equilateral Triangle");
            }
            else
            {
                System.out.println("It is an isosceles triangle");
            }
            } else if (l2==l3) {
            System.out.println("It is an isosceles triangle");

            }
        else
        {
            System.out.println("It is a scalene triangle");
        }
        }
    }

