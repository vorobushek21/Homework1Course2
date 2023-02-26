package transport.cars;

import transport.Competing;
import transport.Transport;
import transport.TransportTypeException;
import transport.drivers.DriverC;

public class Bus extends Transport<DriverC> implements Competing {

    public enum Capacity {
        EXTRA_SMALL(0, 10),
        SMALL(0, 25),
        MIDDLE(25, 50),
        LARGE(50, 80),
        EXTRA_LARGE(80, 120);


        private int minPassenger;
        private int maxPassenger;

        Capacity(int minPassenger, int maxPassenger) {
            this.minPassenger = minPassenger;
            this.maxPassenger = maxPassenger;
        }

        public int getMinPassenger() {
            return minPassenger;
        }

        public int getMaxPassenger() {
            return maxPassenger;
        }
    }


    Capacity capacityPassenger;

    public Bus(String brand, String model, double engineVolume, DriverC driver, Capacity capacityPassenger) {
        super(brand, model, engineVolume, driver);
        this.capacityPassenger = capacityPassenger;
    }

    private String printCapacity(Capacity capacity) {
        String str1 = "Вместимость: ";
        String str2;
        String str3;
        if (capacity.minPassenger != 0) {
            str2 = "от " + capacity.minPassenger + " мест ";
        } else {
            str2 = "";
        }
        str3 = "до " + capacity.maxPassenger + " мест";

        return str1 + str2 + str3;
    }

    @Override
    public void startMove() {
        System.out.println("Bus " + getBrand() + " start move");
    }

    @Override
    public void stopMove() {
        System.out.println("Bus " + getBrand() + " stop move");

    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if (getType() == null || capacityPassenger == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип т/c - " + getType() + " вместимость - " + printCapacity(capacityPassenger));
        }
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

    @Override
    public void getDiagnosed() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не проходят диагностику");
    }

    public String toString() {
        return "brand = " + getBrand() +
                ", model = " + getModel() +
                ", engineVolume = " + getEngineVolume() +
                ", driver = " + getDriver() +
                ", loadCapacity = " + printCapacity(capacityPassenger);
    }
}
