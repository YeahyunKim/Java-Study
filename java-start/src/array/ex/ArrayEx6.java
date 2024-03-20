package array.ex;

import java.util.Scanner;

//문제 - 2차원 배열1
//사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
//2차원 배열을 사용하고, 실행 결과 예시를 참고하자.

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};


        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수 : ");
                students[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < students.length; i++) {
            int total = 0;

            for (int j = 0; j < subjects.length; j++) {
                total += students[i][j];
            }

            double average = (double) total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);

        }


    }
}
