package JavaFundamentalsCodingND.Datatypes;

//Write a Java program to compare two numbers and print if they are equal or different,
//        smaller, larger, smaller or equal, larger or equal: 25; 39
//        25 != 39
//        25 < 39
//        25 <= 39


import java.util.Scanner;

public class ND9 {
    public static void main(String[] args) {

        printComparison(10, 10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        if (number1 >= number2) {
            System.out.println(number1 + ">=" + number2);

        } else if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }
    }


    private static void printComparison(int numberOne, int numberTwo) {
        if (numberOne == numberTwo) {
            System.out.printf("%d == %d", numberOne, numberTwo);
        } else System.out.printf("%d != %d", numberOne, numberTwo);
    }
}
