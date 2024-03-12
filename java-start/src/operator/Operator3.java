package Operator;

public class Operator3 {
    public static void main(String[] args) {
        //곱셈이 먼저 연산이 된다.
        int sum1 = 1 + 2 * 3; //7
        int sum2 = (1 + 2) * 3; //9

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
