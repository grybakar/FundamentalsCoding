package JavaFundamentalsCodingND.Datatypes;

import static java.lang.Math.PI;

/*Write a Java program to print the area and perimeter of a circle: radius = 7.5
Output: Area = 176.71458676442586; Perimeter = 47.12388980384689*/
public class ND5 {

    public static void main(String[] args) {

        double radius = 7.5;
        double area = PI * Math.pow(radius, 2);
        double perimeter = 2 * PI * radius;

        System.out.println("Area = " + area + "; Perimeter = " + perimeter);
        System.out.println("Area = " + getAreaOfCircle(7.5) + "; Perimeter = " + getPerimeterOfCircle(7.5));
    }

    static double getAreaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }

    static double getPerimeterOfCircle(double radius) {
        return 2 * PI * radius;
    }

}

