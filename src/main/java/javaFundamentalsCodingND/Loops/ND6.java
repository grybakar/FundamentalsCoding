package javaFundamentalsCodingND.Loops;
/*Write a Java program to print Fibonacci series of n terms: 10
Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

import java.util.Scanner;

public class ND6 {

    private static int number;
    private static int num1;
    private static int num2;

    private static void getNumber(int number, int num1, int num2) {
        ND6.number = number;
        ND6.num1 = num1;
        ND6.num2 = num2;

        if (number == 1) {
            System.out.println(num1);
            return;
        } else if (number == 2) {
            System.out.println(num2);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1 = 0;
        int num2 = 1;

        System.out.print("Please enter a number ");
        int userInput = input.nextInt();

        getNumber(userInput, num1, num2);

        int numberWithoutTwoFirstNumbers = number - 2;
        int fibonaciNumber = 0;

        while (numberWithoutTwoFirstNumbers != 0) {
            fibonaciNumber = num1 + num2;
            num1 = num2;
            num2 = fibonaciNumber;
            numberWithoutTwoFirstNumbers--;
        }

        System.out.println(fibonaciNumber);

    }


}


