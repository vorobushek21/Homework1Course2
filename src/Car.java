public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (model == null || model.equals("")) {
            this.model = "default";
        }if (brand == null || brand.equals("")) {
            this.brand = "default";
        }if (country == null || country.equals("")) {
            this.country = "default";
        }if (color == null || color.equals("")) {
            this.color = "белый";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }if (year <= 0) {
            this.year = 2000;
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
        return "Автомобиль " +
                "брэнд ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", объем двигателя =" + engineVolume +
                ", цвет ='" + color + '\'' +
                ", год сборки =" + year +
                ", страна ='" + country + '\'' +
                '}';
    }
}
