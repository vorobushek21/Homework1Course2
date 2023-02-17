import transport.Car;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        boolean summer = true;
        boolean winter = false;
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "автомат", "седан", 154, 5, summer, 100);
        //Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        //Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        //Car kia = new Car("KIA", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        //Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Car hyundai2 = new Car("Hyundai", "", 0, "оранжевый", 2016, "Южная Корея", "", "внедорожник", 0, 4, winter, 200);
        Bus uaz = new Bus("УАЗ", "2300","" , 1980, "Россия", 120);
        Bus gazel = new Bus("ГАЗель", "автобус", "Желтая", 2000, "Россия", 180);
        Bus mers = new Bus("Мерседес", "Спринтер", "Серый", 2015, "Германия", 250);
        Car.Key ladaKey = lada.new Key(true, false);
        Car.Key hyundaiKey = hyundai2.new Key(false, true);
        System.out.println(uaz.toString());
        System.out.println(lada.toString());
        lada.changeTyresType();
        System.out.println(lada.toString());
        System.out.println(hyundai2.toString());

    }
}