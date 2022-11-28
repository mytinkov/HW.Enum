import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Лада", "Гранта", 1.4f);
        Car ladaVesta = new Car("Лада", "Веста", 1.8f);
        Car uazPatriot = new Car("УАЗ", "Патриот", 2.4f);
        Car ladaPriora = new Car("Лада", "Приора", 1.6f);

        System.out.println(ladaGranta);
        System.out.println("Лучшее время круга: " + ladaGranta.getBestLapTime());
        ladaGranta.startMovement();
        ladaGranta.stopMovement();

        Truck kamaz1 = new Truck("Камаз1", "12 тонн", 8.0f);
        Truck kamaz2 = new Truck("Камаз2", "12 тонн", 8.0f);
        Truck kamaz3 = new Truck("Камаз3", "12 тонн", 8.0f);
        Truck kamaz4 = new Truck("Камаз4", "12 тонн", 8.0f);

        System.out.println(kamaz1);
        System.out.println("Лучшее время круга: " + kamaz1.getBestLapTime());

        Bus bus1 = new Bus("Белаз", "2125", 6.0f);
        Bus bus2 = new Bus("Белаз2", "2125", 6.0f);
        Bus bus3 = new Bus("Белаз3", "2125", 6.0f);
        Bus bus4 = new Bus("Белаз4", "2125", 6.0f);

        System.out.println(bus1);
        System.out.println("Лучшее время круга: " + bus1.getBestLapTime());

        DriverB driverB = new DriverB("А", 25, ladaGranta);
        System.out.println(driverB);
        driverB.refill();

    }

}