package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
    //클래스 내부에서의 호출은 public / default / private 모두 호출이 가능하다. 즉, 자기 자신에게 접근하는 것은 문제가 되지 않는다.

    void defaultMethod() {
        System.out.println("defaultField 호출" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }
}
