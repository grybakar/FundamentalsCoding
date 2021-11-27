package javaFundamentalsCodingND.Datatypes;

import java.util.Scanner;

/*Write a Java program that takes three numbers as input to calculate and print the average of
the numbers: 10, 20, 30
Output: Average = 20*/
public class ND6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        int numbersSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();
            numbersSum += numbers[i];
        }
        System.out.println("Avarage = " + numbersSum/numbers.length);

    }
}