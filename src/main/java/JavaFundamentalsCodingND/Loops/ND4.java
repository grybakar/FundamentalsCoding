package JavaFundamentalsCodingND.Loops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both
        Divided by 3 - 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69,
        72, 75, 78, 81, 84, 87, 90, 93, 96, 99
        Divided by 5 - 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
        Divided by 3 & 5 - 15, 30, 45, 60, 75, 90*/
public class ND4 {

    public static void main(String[] args) {

        List<Integer> dividedBy3 = new ArrayList<>();
        List<Integer> dividedBy5 = new ArrayList<>();
        List<Integer> dividedBy3And5 = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                dividedBy3.add(i);
            }
            if (i % 5 == 0) {
                dividedBy5.add(i);
            }
            if (i % 5 == 0 && i % 3 == 0) { //Possible to use Hashmap or Hashset to add duplicates from the other collection?
                dividedBy3And5.add(i);
            }

        }
        System.out.println("Divided by 5 - " + dividedBy5);
        System.out.println("Divided by 3 - " + dividedBy3);
        System.out.println("Divided by 3&5 - " + dividedBy3And5);

//        HashSet<Integer> dividedBy3 = new HashSet<>();
//        HashSet<Integer> dividedBy5 = new HashSet<>();
//        HashSet<Integer> dividedBy3And5 = new HashSet<>();
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                dividedBy3.add(i);
//            }
//            if (i % 5 == 0) {
//                dividedBy5.add(i);
//            }
//            if (!dividedBy3.add(i)) { //Possible to use Hashmap or Hashset to add duplicates from the other collection?
//                dividedBy3And5.add(i);
//            }
//        }
//
//        for (Integer skaicius : dividedBy3And5) {
//            System.out.println(skaicius);
//        }


    }
}
