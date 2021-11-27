package javaFundamentalsCodingND.Datatypes;

import java.util.Scanner;

/*Write a Java program to compute the sum of the digits of an integer: 133
Output: 7*/
public class ND10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSum = 0;
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        while (number > 0) {
            numberSum += number % 10;
            number = number / 10;
        }
        System.out.println(numberSum);
    }
}
//    Scanner input = new Scanner(System.in);
//        System.out.println("enter a string");
//                String numbers = input.nextLine();  //String would be 55
//                int sum = 0;
//                for (char c : numbers.toCharArray()) {
//                sum += c - '0';
//                }
//                System.out.println(sum); //the answer is 10


