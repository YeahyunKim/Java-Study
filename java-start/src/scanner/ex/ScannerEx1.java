package scanner.ex;

import java.util.Scanner;

//문제 - 이름 나이 입력받고 출력하기
//사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이
//어야 합니다.
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");

        String name = scanner.nextLine(); // 이름을 입력받는다.
        System.out.print("당신의 나이를 입력하세요:");

        int age = scanner.nextInt(); // 나이를 입력받는다. 나이는 정수이므로 nextInt()를 사용한다.
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니 다.");
    }
}
