package transport;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;

    private T driver;

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

    public void getInfo() {
        System.out.println("водитель "+driver.getName()+ " управляет автомобилем " +getBrand()+ " и будет участвовать в заезде");
    }
}

    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 150;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}*/
