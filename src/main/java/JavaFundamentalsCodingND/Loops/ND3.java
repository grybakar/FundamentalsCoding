package JavaFundamentalsCodingND.Loops;

import java.util.Scanner;

/*Write a Java program that accepts an integer (n) and displays n, nn, nnn, nnnn, nnnnnn: 5
Output: 5, 55, 555, 5555, 55555*/
public class ND3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 9");
        int number = scanner.nextInt();

        int rows = 5;


        for (int i = 1; i <= rows; ++i) {

            for (int j = 1; j <= i; ++j) {
                System.out.print(number);
            }

            System.out.print(",");   // How to remove the last comma???
        }
    }
}