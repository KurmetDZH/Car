package assalamAleikum;

public class Car {
    private String brand;
    private String classOfCar;
    private int wieght;
    private Driver driver;
    private Engine engine;


    public Car(String brand, String classOfCar, int wieght, Driver driver, Engine engine){
        this.brand = brand;
        this.classOfCar = classOfCar;
        this.wieght = wieght;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public void stop (){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public String getBrand() {
        return brand;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public int getWieght() {
        return wieght;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }
}
