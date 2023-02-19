package transport;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;

    private T driver;

    public enum Type {
        CAR,
        TRUCK,
        BUS;
    }

    /*private String color;
    private final int year;
    private final String country;
    private int maxSpeed;*/

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 ? 5.0 : engineVolume);
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract Type getType();

    public abstract void printType();

    public void getInfo() {
        System.out.println("водитель "+driver.getName()+ " управляет автомобилем " +getBrand()+ " и будет участвовать в заезде");
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "brand = " + brand +
                ", model = " + model +
                ", engineVolume = " + engineVolume +
                ", driver = " + driver;
    }
}


