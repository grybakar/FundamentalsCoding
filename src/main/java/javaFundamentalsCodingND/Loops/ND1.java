package javaFundamentalsCodingND.Loops;

import java.util.Scanner;

/*Write a Java program that takes a number and prints its multiplication table up to 10: 8
Output: 8, 16, 24, 32, …, 80*/
public class ND1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            number += 8;
            System.out.println(number);
        }

    }
}
