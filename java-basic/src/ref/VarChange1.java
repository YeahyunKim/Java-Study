package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a값 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b값 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //여기서 핵심은 int b = a 라고 했을 때 변수에 들어있는 값을 복사해서 전달한다는 점이다. 따라서 a=20, b=30 이라고 했을 때
        //각각 본인의 값만 변경되는 것을 확인할 수 있다.
    }
}
