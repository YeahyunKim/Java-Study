package method;

public class Method1Ref {
    public static void main(String[] args) {

        //계산 1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 " + sum1);

        //계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력 " + sum2);


    }

    // 연산 메소드 추가
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }


}

//add(a, b) 라는 메소드를 추가하여, 코드를 더 간결하게 바꿀 수 있다.