package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean tyres) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
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
        //if (model == null || model.equals("")) {
        //    this.model = "default";
        //}if (brand == null || brand.equals("")) {
        //    this.brand = "default";
        //}if (country == null || country.equals("")) {
        //    this.country = "default";
        //}
        if (color == null || color.equals("")) {
            this.color = "белый";
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
        //if (year <= 0) {
        //    this.year = 2000;
        //}

    }

    public void changeTyresType() {
        if (this.tyres = false) {
            this.tyres = true;
        } else {
            this.tyres = false;
        }
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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", tyres=" + tyres +
                '}';
    }
}
