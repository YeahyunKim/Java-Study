package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}

//배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것이다. 이전 예제에 배열을 사용해서 변경해보면 위와같이
//System.out.println() 을 여러번 사용하지 않고도 간단하게 코드를 작성할 수 있다.
