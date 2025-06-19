package Coding_test1;

public class test14 {
    public static void main(String[] args) {
//        15. Write a program to find prime numbers between 1 to 100 using loops
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " "); // Print the prime number.
        }
        }
    }
}
