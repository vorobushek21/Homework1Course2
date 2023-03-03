import transport.*;
import transport.cars.Car;
import transport.cars.Bus;
import transport.cars.Truck;
import transport.drivers.DriverB;
import transport.drivers.DriverC;
import transport.drivers.DriverD;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Mechanic> mechanics1 = new ArrayList<>();
        mechanics1.add(new Mechanic("Александр Петров", "BCR"));
        mechanics1.add(new Mechanic("Иван Давыдов", "FastPro"));
        mechanics1.add(new Mechanic("Анна Железнова", "Car Fix"));

        List<Mechanic> mechanics2 = new ArrayList<>();
        mechanics2.add(new Mechanic("Матвей Никитин", "BCR"));
        mechanics2.add(new Mechanic("Всеволод Попов", "FastPro"));
        mechanics2.add(new Mechanic("Роман Новиков", "Car Fix"));

        List<Mechanic> mechanics3 = new ArrayList<>();
        mechanics3.add(new Mechanic("Михаил Маслов", "BCR"));
        mechanics3.add(new Mechanic("Сергей Попов", "FastPro"));
        mechanics3.add(new Mechanic("Николай Шишкин", "Car Fix"));

        DriverB[] driversB = new DriverB[3];
        for (int i = 0; i < driversB.length; i++) {
            driversB[i] = new DriverB("Driver cat. B #" + (i + 1) * 2, true, 4 + i);

        }
        Car lada = new Car("Lada", "Granta", 1.7, driversB[0], mechanics1, "SEDAN");
        System.out.println(lada);
        lada.getInfo();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, driversB[1], mechanics2, "COUPE");
        System.out.println(audi);
        audi.getInfo();
        Car bmw = new Car("BMW", "Z8", 3.0, driversB[2], mechanics3, "PICKUP");
        System.out.println(bmw);
        bmw.getInfo();

        mechanics1.get(0).fixTheCar(lada);
        mechanics2.get(2).maintenance(audi);

        DriverC[] driversC = new DriverC[3];
        for (int i = 0; i < driversB.length; i++) {
            driversC[i] = new DriverC("Driver cat. C #" + (i + 1) * 3, true, 7 + i);

        }

        Bus uaz = new Bus("УАЗ", "2300", 7.5, driversC[0], mechanics3, Bus.Capacity.EXTRA_SMALL);
        System.out.println(uaz);
        uaz.getInfo();
        Bus gazel = new Bus("ГАЗель", "автобус", 8.0, driversC[1], mechanics1, Bus.Capacity.LARGE);
        System.out.println(gazel);
        gazel.getInfo();
        Bus mers = new Bus("Мерседес", "Спринтер", 10.0, driversC[2], mechanics2, Bus.Capacity.MIDDLE);
        System.out.println(mers);
        mers.getInfo();

        mechanics1.get(1).fixTheCar(uaz);
        mechanics2.get(2).maintenance(mers);

        DriverD[] driversD = new DriverD[3];
        for (int i = 0; i < driversD.length; i++) {
            driversD[i] = new DriverD("Driver cat. D #" + (i + 2) * 3, true, 2 + i);

        }

        Truck volvo = new Truck("Volvo", "Wild", 13.2, driversD[0], mechanics2, "N2");
        System.out.println(volvo);
        volvo.getInfo();
        Truck scania = new Truck("Scania", "R999", 12.5, driversD[1], mechanics3, "N1");
        System.out.println(scania);
        scania.getInfo();
        Truck tata = new Truck("Tata", "Prima", 12.0, driversD[2], mechanics1, "N3");
        System.out.println(tata);
        tata.getInfo();

        mechanics1.get(2).fixTheCar(scania);
        mechanics2.get(1).maintenance(tata);

        List<Transport> raceCars = new ArrayList<>();
        raceCars.add(lada);
        raceCars.add(audi);
        raceCars.add(bmw);
        raceCars.add(uaz);
        raceCars.add(gazel);
        raceCars.add(mers);
        raceCars.add(volvo);
        raceCars.add(scania);
        raceCars.add(tata);


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

        Transport.transportInfo(audi);
        Transport.transportInfo(mers);
        Transport.transportInfo(tata);

        ServiceStation service = new ServiceStation();
        service.addCarToQueue(lada);
        service.addCarToQueue(tata);
        service.addCarToQueue(uaz);
        service.technicalInspection();

        List<String> mechanicsName1 = new ArrayList<>();
        for (Mechanic l : mechanics1) {
            mechanicsName1.add(l.getName());
        }
        List<String> mechanicsName2 = new ArrayList<>();
        for (Mechanic l : mechanics2) {
            mechanicsName2.add(l.getName());
        }
        List<String> mechanicsName3 = new ArrayList<>();
        for (Mechanic l : mechanics3) {
            mechanicsName3.add(l.getName());
        }

        Map<Transport, List<String>> carMechanics = new HashMap<>();
        carMechanics.put(new Car("Lada", "Granta", 1.7, driversB[0], mechanics1, "SEDAN"), mechanicsName1);
        carMechanics.put(new Car("Audi", "A8 50 L TDI quattro", 3.0, driversB[1], mechanics2, "COUPE"), mechanicsName2);
        carMechanics.put(new Car("BMW", "Z8", 3.0, driversB[2], mechanics3, "PICKUP"), mechanicsName3);
        carMechanics.put(new Bus("УАЗ", "2300", 7.5, driversC[0], mechanics3, Bus.Capacity.EXTRA_SMALL), mechanicsName3);
        carMechanics.put(new Bus("ГАЗель", "автобус", 8.0, driversC[1], mechanics1, Bus.Capacity.LARGE), mechanicsName1);
        carMechanics.put(new Bus("Мерседес", "Спринтер", 10.0, driversC[2], mechanics2, Bus.Capacity.MIDDLE), mechanicsName2);
        carMechanics.put(new Truck("Volvo", "Wild", 13.2, driversD[0], mechanics2, "N2"), mechanicsName2);
        carMechanics.put(new Truck("Scania", "R999", 12.5, driversD[1], mechanics3, "N1"), mechanicsName3);
        carMechanics.put(new Truck("Tata", "Prima", 12.0, driversD[2], mechanics1, "N3"), mechanicsName1);

        for (Map.Entry<Transport, List<String>> m : carMechanics.entrySet()) {
                System.out.println("Т/с " + m.getKey().getBrand() + " обслуживается следующими механиками: " + m.getValue());
        }

        Set<Driver> driversList = new HashSet<>();

        driversList.add(driversB[2]);
        driversList.add(driversD[1]);
        driversList.add(driversC[2]);
        driversList.add(driversD[0]);
        driversList.add(driversB[2]);
        driversList.add(driversC[1]);
        driversList.add(driversD[0]);

        Iterator<Driver> iterDrivers = driversList.iterator();

        while (iterDrivers.hasNext()) {
            System.out.println(iterDrivers.next());
        }
    }
}