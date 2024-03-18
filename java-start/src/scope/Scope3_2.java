package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

// 위의 코드는 좋은 코드의 예 이다.
// temp가 if문 안에서만 사용하고 if문 안에서 선언이 되었기 때문에, if문이 종료후 메모리에서 사라진다.