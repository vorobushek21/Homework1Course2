package transport;

import java.util.LinkedList;
import java.util.Queue;
import transport.Transport;

public class ServiceStation<Car, Truck> {

    Queue<Transport> transports = new LinkedList<>();

    public void addCarToQueue(Transport<?> transport) {
        if (transport.isItPossibleForMaintenance()) {
            transports.offer(transport);
            System.out.println(transport.getBrand() + " встал в очередь на техническую проверку");
        } else {
            System.out.println("Автобусы не могут встать в очередь");
        }
    }

    public void technicalInspection() {
        System.out.println(transports.remove().getBrand() + " прошел техническую проверку");
    }
}
