package extend1.overriding;


public class ElectricCar extends Car { //슈퍼클래스 Car에서 상속받는 자식클래스 ElectricCar
    @Override // 어노테이션
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge() {
        System.out.println("충전합니다.");
    }
}
