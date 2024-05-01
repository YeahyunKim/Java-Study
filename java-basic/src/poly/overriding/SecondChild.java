package poly.overriding;

public class SecondChild extends Child {
    public String value = "SecondChild";
    @Override
    public void method() {
        System.out.println("SecondChild.method");
    }
}
