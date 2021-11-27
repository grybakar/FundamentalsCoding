package JavaFundamentalsCodingND.Datatypes;

// Write a Java program to divide two numbers and print on the screen: 50 / 3 = 16 remainder 2
public class ND2 {
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 3;
        int division = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("50/3 = " + division + " remainder " + remainder);
        System.out.println("50/3 = " + 50 / 3 + " remainder " + remainder);
        System.out.println("50/3 = " + 50 / 3 + " remainder " + 50 % 3);
        getDivisionWithRemainder(50, 3);
    }

    static void getDivisionWithRemainder(int number1, int number2) {
        System.out.println("50/3 = " + number1 / number2 + " remainder " + number1 % number2);


    }

}
