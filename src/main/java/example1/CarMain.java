package example1;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMain {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.yearCreated = 2021;
        audi.brand = "Audi";
        audi.price = 15000;
        audi.weight = 1500.00;
        audi.isElectric = true;

        System.out.println(audi);

        audi.turnOnEngine();
        audi.move();
        audi.playSong("Juoda orchideja");

        Car bmw = new Car(1994, 1400.00, 9000, "BMW", false);
        System.out.println(bmw);

        int[] numbers = {4, 5, 6};
        Car[] cars = new Car[3];

        cars[0] = audi;
        cars[2] = bmw;
        cars[1] = new Car(2021, 1200.00, 10000, "Ferrari", true);


        System.out.println(Arrays.toString(cars));

        for (int indeksas = 0; indeksas < numbers.length; indeksas++) {
            System.out.println(numbers[indeksas]);
        }

        for (Car car : cars) {
            System.out.println(car.brand);
        }
    }
}
