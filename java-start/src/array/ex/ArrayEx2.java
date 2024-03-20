package array.ex;

import java.util.Scanner;

//문제 - 배열의 입력과 출력
//사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
//출력시출력포멧은1,2,3,4,5와같이 `,` 쉼표를사용해서구분하고,마지막에는쉼표를넣지않아야한다. 실행 결과 예시를 참고하자.


public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayValue = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < arrayValue.length; i++) {
            arrayValue[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < arrayValue.length; i++) {
            System.out.print(arrayValue[i]);
            if (i < arrayValue.length - 1) {
                System.out.print(", ");
            }
        }



    }
}
