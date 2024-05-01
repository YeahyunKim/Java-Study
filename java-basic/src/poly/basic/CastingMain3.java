package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent1 = (Parent) child; // 업케스팅은 생략이 가능하다.
        Parent parent2 = child; // 업케스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
