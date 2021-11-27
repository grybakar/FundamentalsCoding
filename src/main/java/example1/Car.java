package example1;

public class Car {

    //Apibudiname STATE(busena), kaip automobilis atrodys.
    int yearCreated;
    double weight;
    int price;
    String brand;
    boolean isElectric;

    //defaultinis/standartinis konstruktorius, kuris siaip buna nematomas.
    public Car() {
        System.out.println("Invoking Car constructor to build a CAR");
    }

    public Car(int yearCreated, double weight, int price, String brand, boolean isElectric) {
        this.yearCreated = yearCreated;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
    }



    //Apibudiname BEHAVIOR (elgsena), kaip automobilis elgsis.
    //void reiskia, kad metodas nieko negrazina.


    void turnOnEngine() {
        System.out.println("Engine in ON...");
    }

    void move() {
        System.out.println("Car is moving...");
    }

    //sis metodas turi viena parametra
    void playSong(String songName) {
        System.out.println("Play Song " + songName + ".mp3");
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearCreated=" + yearCreated +
                ", weight=" + weight +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';


    }


}





