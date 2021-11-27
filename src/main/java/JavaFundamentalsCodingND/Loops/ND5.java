package JavaFundamentalsCodingND.Loops;

import java.util.Scanner;

/*Write a Java program that prints all the powers of a number under 100: 3
Output: 3, 9, 27, 81*/
public class ND5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 9");
        double number = scanner.nextInt();
        double power = 1;
        double result = 0;
        boolean isTrue = true;

        while (isTrue) {
            power += 1;
            if (Math.pow(number, power) > 100) {
                isTrue = false;
            } else {
                result = Math.pow(number, power);
                System.out.println(result);
            }
        }
    }
}
