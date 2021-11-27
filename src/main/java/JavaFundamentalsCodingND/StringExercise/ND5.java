package JavaFundamentalsCodingND.StringExercise;

public class ND5 {
    //Write a Java program to extract the first half of a string of even length: “Programmer”
    //Output: Progr

    public static void main(String[] args) {
        String text = "Programmer";

        for (int i = 0; i < text.length() / 2; i++) {
            System.out.print(text.charAt(i));
        }


    }
}
