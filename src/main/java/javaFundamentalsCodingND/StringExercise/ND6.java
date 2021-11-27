package javaFundamentalsCodingND.StringExercise;

public class ND6 {

    //Write a Java program to create the concatenation of the two strings except removing the first
    //character of each string. The length of the strings must be 1 and above: “Java” and
    //“Fundamentals”
    //Output: avaundamentals

    public static void main(String[] args) {
        String word1 = "Java";
        String word2 = "Fundamentals";

        // substring metodas, kuriame galime nurodyti jo pirma ir paskutini elementus.

        System.out.println(word1.substring(1) + word2.substring(1));


    }

}

