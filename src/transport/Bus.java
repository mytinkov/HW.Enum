package transport;

public class Bus extends Transport implements Competing{


    @Override
    public void startMovement() {
        System.out.println("Car " + getBrand() + " " + getModel() + " started moving");
    }

    @Override
    public void stopMovement() {
        System.out.println("Car " + getBrand() + " " + getModel() + " stopped moving");
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Автобус:" +
                " Бренд = " + getBrand() +
                " / Модель = " + getModel() +
                " / Объем двигателя = " + getEngineVolume();
    }

    @Override
    public String getPitStop() {
        return "Пит стоп - 6 раз";
    }

    @Override
    public int getBestLapTime() {
        return 11;
    }

    @Override
    public int getMaxSpeed() {
        return 600;
    }
}
