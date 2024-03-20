package method;

public class Method1 {
    public static void main(String[] args) {

        //계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;

        //계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + "연산 수행");
        int sum2 = x + y;

    }
}

//위처럼 필요한 기능을 미리 정의해두고 앞으로 쭉 사용하면 편리하지 않을까? 이러한 문제를 해결해줄 수 있는게 바로 메소드(method) 이다.