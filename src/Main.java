import assalamAleikum.Car;
import assalamAleikum.Driver;
import assalamAleikum.Engine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Driver driver = new Driver("Джетенов Курмет", 2);
        Engine engine = new Engine(367, 100);
        Car car = new Car("Lexus LX 570", "off-roader", 2730, driver, engine);

        int action = 4;

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Class: " + car.getClassOfCar());
        System.out.println("Weight: " + car.getWieght());
        System.out.println("Driver: " + car.getDriver().getName());
        System.out.println("Experience: " + car.getDriver().getDrivingExperience());
        System.out.println("Engine Power: " + car.getEngine().getPower());
        System.out.println("Engine Performance: " + car.getEngine().getPerformance());

        switch (action){
            case 1: car.start();
            break;
            case 2: car.turnLeft();
            break;
            case 3: car.turnRight();
            break;
            case 4: car.stop();
        }
        System.out.println(car);

        }

    }
