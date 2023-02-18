package transport.cars;

import transport.Competing;
import transport.Transport;
import transport.drivers.DriverD;

public class Truck extends Transport<DriverD> implements Competing {


    public Truck(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Truck "+ getBrand() + " start move" );
    }

    @Override
    public void stopMove() {
        System.out.println("Truck " + getBrand() + " stop move");

    }


    @Override
    public void pitStop() {
        System.out.println("Pit Stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Best Lap Time");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed");
    }

}
