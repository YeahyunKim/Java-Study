package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.print("문자열을 입력하세요: ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("입력한 문자열은 : " + str);
        }

    }
}
