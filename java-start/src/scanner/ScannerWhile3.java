package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        int sum = 0; //합산할 값
        Scanner input = new Scanner(System.in);
        System.out.println("0을 입력하면 지금까지 입력한 모든 값의 합을 출력해드리고, 프로그램이 종료됩니다.");

        while (true) {
            System.out.print("입력할 정수 값: ");
            int value = input.nextInt();
            sum += value;
            if (value == 0) {
                System.out.println("합계 : " + sum + " 프로그램을 종료합니다.");
                break;
            }

        }

    }
}
