package transport.cars;

import transport.Competing;
import transport.Transport;
import transport.drivers.DriverC;

public class Bus extends Transport<DriverC> implements Competing {


    public Bus(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Bus "+ getBrand() + " start move" );
    }

    @Override
    public void stopMove() {
        System.out.println("Bus " + getBrand() + " stop move");

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
