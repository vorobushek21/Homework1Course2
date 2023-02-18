package transport.cars;

import transport.Competing;
import transport.Transport;
import transport.drivers.DriverB;

import java.sql.SQLOutput;

public class Car extends Transport<DriverB> implements Competing {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Car "+ getBrand() + " start move" );
    }

    @Override
    public void stopMove() {
        System.out.println("Car " + getBrand() + " stop move");
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

    /*private final String brand;
    //private final String model;
    //private String color;
    //private final int year;
    //private final String country;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean tyres;
    private String tyresType;

    public class Key{
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return tyres;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               int registrationNumber,
               int numberOfSeats,
               boolean tyres,
               int maxSpeed) {
        super(model, brand, color, year, country, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tyres = tyres;
        tyresType = "";
        if (tyres = false) {
            tyresType = "Зимняя резина";
        } else {
            tyresType = "Летняя резина";
        }
        if (transmission == null || transmission.equals("")) {
            this.transmission = "механика";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (registrationNumber <= 0) {
            this.registrationNumber = 123;
        }

    }

    public void changeTyresType() {
        if (this.tyres = false) {
            this.tyres = true;
        } else {
            this.tyres = false;
        }
    }



    @Override
    public String toString() {
        return "Car{" + super.toString() + " ," +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", tyres=" + tyres +
                ", tyresType='" + tyresType + '\'' +
                '}';
    }*/
}
