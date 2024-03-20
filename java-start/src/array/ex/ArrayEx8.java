package array.ex;

import java.util.Scanner;

//문제 - 상품 관리 프로그램 만들기
//자바를 이용하여 상품 관리 프로그램을 만들어 보자. 이 프로그램은 다음의 기능이 필요하다:
////- 상품 등록: 상품 이름과 가격을 입력받아 저장한다.
////- 상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.

// 다음과 같이 동작해야 한다:
//// - 첫 화면에서 사용자에게 세 가지 선택을 제시한다: "1. 상품 등록", "2. 상품 목록", "3. 종료"
//// - "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
//// - "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다.
//// - "3. 종료"를 선택하면 프로그램을 종료한다.


public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10; //최대 등록 가능한 상품 개수
        int productCount = 0; //현재 등록되어있는 상품 개수
        String[] productNames = new String[maxProducts]; //상품명 배열
        int[] productPrices = new int[maxProducts]; //상품가격 배열


        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            if (selectedOption == 1) {
                if (productCount == maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();


                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (selectedOption == 2) {
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.print(productNames[i] + " : " + productPrices[i]);
                }

            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }


    }
}
