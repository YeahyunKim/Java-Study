package extend1.overriding;

public class GasCar extends Car { //슈퍼클래스 Car에서 상속받는 자식클래스 GasCar

    public void move() {
        System.out.println("가스차를 빠르게 이동합니다.");
    }

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
