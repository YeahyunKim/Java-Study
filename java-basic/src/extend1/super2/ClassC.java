package extend1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // 부모에 기본 생성자가 없으면, 직접 호출을 해야한다.
        System.out.println("ClassC 생성자");
    }
}
