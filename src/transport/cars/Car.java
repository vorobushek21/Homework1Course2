package transport.cars;

import transport.Competing;
import transport.Mechanic;
import transport.Transport;
import transport.drivers.DriverB;

import java.lang.reflect.Type;
import java.util.List;

public class Car extends Transport<DriverB> implements Competing {

    enum BodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }
    }

    BodyType typeOfBody;

    public Car(String brand, String model, double engineVolume, DriverB driver, List<Mechanic> mechanics, String typeOfBody) {
        super(brand, model, engineVolume, driver, mechanics);
        this.typeOfBody = BodyType.valueOf(typeOfBody);
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
    public Transport.Type getType() {
        return Type.CAR;
    }


    @Override
    public void printType() {
        if (getType() == null || typeOfBody.getBodyType() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип т/c - " + getType() + " тип кузова - " + typeOfBody.getBodyType());
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
    public void getDiagnosed(){
        System.out.println("Легковой втомобиль " + getBrand() + " прошел диагностику");
    }

    @Override
    public boolean isItPossibleForMaintenance() {
        return true;
    }

    public String toString() {
        return "brand = " + getBrand() +
                ", model = " + getModel() +
                ", engineVolume = " + getEngineVolume() +
                ", driver = " + getDriver() +
                ", bodyType = " + this.typeOfBody.getBodyType();
    }
}
