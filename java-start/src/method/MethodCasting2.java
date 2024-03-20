package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);
    }
}
// double형 매개변수에 int형 인수를 전달하는데 문제없이 잘 동작한다. 그 이유는 double이 int보다 더 큰값을 담을 수 있기 때문이다.