package transport.cars;

import transport.Competing;
import transport.Transport;
import transport.drivers.DriverD;

public class Truck extends Transport<DriverD> implements Competing {

    enum LoadCapacity {
        N1(0, 3.5f),
        N2(3.5f, 12),
        N3(12, 0);
        private float minLoad;
        private float maxLoad;

        LoadCapacity(float minLoad, float maxLoad) {
            this.minLoad = minLoad;
            this.maxLoad = maxLoad;
        }

        public float getMinLoad() {
            return minLoad;
        }

        public float getMaxLoad() {
            return maxLoad;
        }
    }

    LoadCapacity capacity;

    public Truck(String brand, String model, double engineVolume, DriverD driver, String loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = LoadCapacity.valueOf(loadCapacity);
    }


    @Override
    public void startMove() {
        System.out.println("Truck " + getBrand() + " start move");
    }

    @Override
    public void stopMove() {
        System.out.println("Truck " + getBrand() + " stop move");

    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
        if (getType() == null || capacity == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип т/c - " + getType() + " грузоподъемность - " + printCapacity(capacity));
        }
    }

    private String printCapacity(LoadCapacity capacity) {
        String str1 = "Грузоподъемность: ";
        String str2;
        String str3;
        if (capacity.minLoad != 0) {
            str2 = "от " + capacity.minLoad + " тонн ";
        } else {
            str2 = "";
        }
        if (capacity.maxLoad != 0) {
            str3 = "до " + capacity.maxLoad + " тонн";
        } else {
            str3 = "";
        }
        return str1 + str2 + str3;
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

    public String toString() {
        return "brand = " + getBrand() +
                ", model = " + getModel() +
                ", engineVolume = " + getEngineVolume() +
                ", driver = " + getDriver() +
                ", loadCapacity = " + printCapacity(capacity);
    }

}
