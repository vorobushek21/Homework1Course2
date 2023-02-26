import transport.Driver;
import transport.TransportTypeException;
import transport.cars.Car;
import transport.cars.Bus;
import transport.cars.Truck;
import transport.drivers.DriverB;
import transport.drivers.DriverC;
import transport.drivers.DriverD;

public class Main {
    public static void main(String[] args) {

        DriverB[] driversB = new DriverB[3];
        for (int i = 0; i < driversB.length; i++) {
            driversB[i] = new DriverB("Driver cat. B #" + (i + 1) * 2, true, 4 + i);

        }
        Car lada = new Car("Lada", "Granta", 1.7, driversB[0], "SEDAN");
        System.out.println(lada);
        lada.getInfo();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, driversB[1], "COUPE");
        System.out.println(audi);
        audi.getInfo();
        Car bmw = new Car("BMW", "Z8", 3.0, driversB[2], "PICKUP");
        System.out.println(bmw);
        bmw.getInfo();

        DriverC[] driversC = new DriverC[3];
        for (int i = 0; i < driversB.length; i++) {
            driversC[i] = new DriverC("Driver cat. C #" + (i + 1) * 3, true, 7 + i);

        }

        Bus uaz = new Bus("УАЗ", "2300", 7.5, driversC[0], Bus.Capacity.EXTRA_SMALL);
        System.out.println(uaz);
        uaz.getInfo();
        Bus gazel = new Bus("ГАЗель", "автобус", 8.0, driversC[1], Bus.Capacity.LARGE);
        System.out.println(gazel);
        gazel.getInfo();
        Bus mers = new Bus("Мерседес", "Спринтер", 10.0, driversC[2], Bus.Capacity.MIDDLE);
        System.out.println(mers);
        mers.getInfo();

        DriverD[] driversD = new DriverD[3];
        for (int i = 0; i < driversD.length; i++) {
            driversD[i] = new DriverD("Driver cat. D #" + (i + 2) * 3, true, 2 + i);

        }

        Truck volvo = new Truck("Volvo", "Wild", 13.2, driversD[0], "N2");
        System.out.println(volvo);
        volvo.getInfo();
        Truck scania = new Truck("Scania", "R999", 12.5, driversD[1], "N1");
        System.out.println(scania);
        scania.getInfo();
        Truck tata = new Truck("Tata", "Prima", 12.0, driversD[2], "N3");
        System.out.println(tata);
        tata.getInfo();

        audi.getType();
        audi.printType();

        mers.getType();
        mers.printType();

        volvo.getType();
        volvo.printType();

        lada.getDiagnosed();
        try {
            mers.getDiagnosed();
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }
        volvo.getDiagnosed();
    }
}