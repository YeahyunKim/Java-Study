package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참소(다형적 참조)
        Parent poly = new Child(); // 업캐스팅
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩 O


        Parent poly2 = new SecondChild(); // 업캐스팅
        System.out.println("Parent -> Child - > SecondChild");
        System.out.println("value = " + poly2.value); // 변수는 오버라이딩 X

        poly2.method(); // 메서드 오버라이딩 O 가장 최하단의 자식 method가 호출됨


    }
}
