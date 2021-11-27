package javaFundamentalsCodingND.StringExercise;

//Write a java program to compare two strings lexicographically, ignoring case differences: “This
//is a comparison” equals “THIS is A Comparison”


//nauja metodas "CompareTo" ir "CompareToIgnoreCase".\
//Each character of both the strings is converted into a Unicode value for comparison.
//Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

//An int value: 0 if the string is equal to the other string.
//< 0 if the string is lexicographically less than the other string
//> 0 if the string is lexicographically greater than the other string (more characters)



public class ND8 {
    public static void main(String[] args) {

        String text1 = "This is a comparison";
        String text2 = "THIS is A Comparison";

        System.out.println(text1.compareToIgnoreCase(text2));

    }
}
