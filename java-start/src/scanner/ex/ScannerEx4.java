package scanner.ex;

import java.util.Scanner;

//문제 - 구구단 출력
//사용자로부터 하나의 정수 `n` 을 입력받고, 입력받은 정수 `n` 의 구구단을 출력하는 프로그램을 작성하세요.
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int value = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(value + " x " + i + " = " + value * i);
        }

    }
}

