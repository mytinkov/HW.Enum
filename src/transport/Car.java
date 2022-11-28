package transport;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
    public String getPitStop() {return "Пит стоп - 2 раза"; }

    @Override
    public int getBestLapTime() {
        return 25;
    }

    @Override
    public int getMaxSpeed() {
        return 120;
    }

    @Override
    public String toString() {
        return "Грузовик:" +
                " Бренд = " + getBrand() +
                " / Модель = " + getModel() +
                " / Объем двигателя = " + getEngineVolume();
    }
}
