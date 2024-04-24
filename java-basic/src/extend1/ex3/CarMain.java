package extend1.ex3;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
        electricCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();

    }
}
