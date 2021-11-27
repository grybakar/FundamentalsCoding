package JavaFundamentalsCodingND.Loops;

import java.util.Scanner;

/*Write a program that prints the first n prime numbers: n = 4
Output: 2, 3, 5, 7*/
public class ND8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter prime number count");
        int primeCount = scanner.nextInt();
        int primeNumber = 2;

        for (int i = primeNumber; i < primeCount; ) {
            if (!(i % 2 == 0) || !(i % 3 == 0)) {
                i++;
            } else {
                System.out.println(primeNumber);
            }
        }
    }
}