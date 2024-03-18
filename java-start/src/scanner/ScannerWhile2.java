package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while (true) {
            System.out.print("첫 번째 값을 입력하세요:");
            int firstValue = scanner.nextInt();
            System.out.print("두 번째 값을 입력하세요:");
            int secondValue = scanner.nextInt();

            if (firstValue == 0 && secondValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = firstValue + secondValue;
            System.out.println("값의 합은 " + sum + " 입니다.");
        }
    }
}
