package extend1.ex;

public class CarMain {
    public static void main(String[] args) {

        //코드를 확인해보면, 전기차와 가스차는 충전, 주유하는 방법만 다르고, 이동하는 move()는 동일한 기능을 가지고 있다.
        //그럼 이 move()를 하나로 묶어주면 어떨까? 즉, Car 라는 클래스를 만들어 그 안에 move()라는 메서드를 만들고,
        //ElectricCar 과 GasCar에게 상속해주면 어떻게 될까?
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();

    }
}
