package JavaFundamentalsCodingND.StringExercise;

//Write a Java program to check whether a given string ends with the contents of another
//string: “Java exercises” ends with “ses”.

public class ND9 {
    public static void main(String[] args) {
        String text = "Java exercises";
        if (text.contains("ses")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

