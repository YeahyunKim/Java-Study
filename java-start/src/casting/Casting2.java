package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue);
    }
}

// double 이 int보다 숫자의 표현 범위가 크다. 이 경우 숫자가 손실되는 문제가 발생할 수 있으므로, 프로그램에서 사전에
// 에러 처리를 해준다. 이럴때는 명시적 형변환을 해주어야한다.