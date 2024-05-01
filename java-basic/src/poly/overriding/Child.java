package poly.overriding;

import poly.overriding.Parent;

public class Child extends Parent {
    public String value = "Child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }

}
