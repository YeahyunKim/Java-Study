package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) { //JAVA 16부터 true면 Child child 변수 선언 가능
            System.out.println("Child 인스턴스가 맞습니다.");
            child.childMethod();
        }

    }
}
