package transport;

public class Truck extends Transport implements Competing {


    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Грузовик:" +
                " Бренд = " + getBrand() +
                " / Модель = " + getModel() +
                " / Объем двигателя = " + getEngineVolume();
    }

    @Override
    public void startMovement() {
        System.out.println("Car " + getBrand() + " " + getModel() + " started moving");
    }

    @Override
    public void stopMovement() {
        System.out.println("Car " + getBrand() + " " + getModel() + " stopped moving");
    }

    @Override
    public String getPitStop() {
        return "Пит стоп - 3 раза";
    }

    @Override
    public int getBestLapTime() {
        return 35;
    }

    @Override
    public int getMaxSpeed() {
        return 45;
    }
}
