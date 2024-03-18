package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

// 위의 코드는 좋은 코드가 아니다.
// 비효율적인 메모리 사용 : temp 라는 변수는 if 문 안에서만 필요한데, 위의 코드에서는 if문 밖에 선언이 되어있어서
// main() 코드 블록이 종료될 때 까지 메모리에 유지된다. 따라서 불필요한 메모리가 낭비된다.

// 코드 복잡성 증가 : temp는 if코드 블록에서만 필요하고, 여기서만 사용하면 되는데, if 문 밖에 선언이 되어있어서
// if문이 종료되고도 여전히 temp라는 변수에 대해 신경을 써주어야 한다.