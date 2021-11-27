package JavaFundamentalsCodingND.Datatypes;
/*Write a Java program to print the area and perimeter of a rectangle: Width = 5.5; Height = 8.5
Output: Area = 47.60; Perimeter = 28.20*/
public class ND7 {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println("Area " + area + "; Perimeter = " + perimeter);
    }
}
