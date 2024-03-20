package array.ex;

import java.util.Scanner;

//문제 - 2차원 배열2
//이전 문제에서 학생수를 입력받도록 개선하자.

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요 : ");
        int studentsCount = scanner.nextInt();

        int[][] students = new int[studentsCount][3]; // 배열생성

        for (int i = 0; i < studentsCount; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수 : ");
                students[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < studentsCount; i++) {
            int total = 0;

            for (int j = 0; j < subjects.length; j++) {
                total += students[i][j];
            }

            double average = (double) total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);

        }


    }
}
