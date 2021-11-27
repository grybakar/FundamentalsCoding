package javaFundamentalsCodingND.StringExercise;

//Write a Java program to count the letters, spaces, numbers and other characters of an input
//        string: “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”
//        Output: 23 letters, 9 spaces, 8 numbers, 6 others

public class ND10 {
    public static void main(String[] args) {
        String text = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        char[] textArray = text.toCharArray();
        int letters = 0;
        int number = 0;
        int other = 0;
        int spaces = 0;

        for (int i = 0; i < textArray.length; i++) {

            if (Character.isLetter(textArray[i])) {
                letters++;
            } else if (Character.isDigit(textArray[i])) {
                number++;
            } else if (Character.isSpaceChar(textArray[i])) {
                spaces++;
            } else {
                other++;
            }
        }
        System.out.println(letters + " letters, " + spaces + " spaces, " + number + " numbers, " + other + " others, ");


    }
}
