package transport;

import java.util.ArrayList;
import java.util.List;
import transport.Mechanic;
import transport.drivers.DriverD;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private List<Mechanic> mechanics;

    private T driver;


    public enum Type {
        CAR,
        TRUCK,
        BUS;
    }


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.driver = driver;
        this.mechanics = mechanics;
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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public static void transportInfo(Transport transport) {
        System.out.println("Водитель авто - " + transport.getDriver().getName() + ", механики авто - "+ transport.getMechanics());
    }

    public abstract void stopMove();

    public abstract Type getType();

    public abstract void printType();

    public abstract void getDiagnosed() throws TransportTypeException;

    public abstract boolean isItPossibleForMaintenance();

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


