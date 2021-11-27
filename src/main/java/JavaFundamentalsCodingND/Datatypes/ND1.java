package JavaFundamentalsCodingND.Datatypes;

//Write a Java program to print the sum of two numbers: 74 + 36 = 110
public class ND1 {
    public static void main(String[] args) {
        int number1 = 74;
        int number2 = 36;
        int sumOfNumber1AndNumber2 = number1 + number2;

        System.out.println(number1 + number2);
        System.out.println(sumOfNumber1AndNumber2);
        System.out.println(74 + 36);
        System.out.println(getSum(74, 36));
        System.out.println(getSum(number1, number2));
    }

    static int getSum(int number1, int number2) {
        return number1 + number2;

    }
}
