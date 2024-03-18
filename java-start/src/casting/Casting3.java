package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환 2147483647 정상출력
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; //형변환 -2147483648 문제발생
        System.out.println("maxIntOver casting = " + intValue);
    }
}

// 두번째의 maxIntOver 값은 int가 담을 수 있는 최고값인 2147483647을 넘었다.
// 하지만 정상적으로 출력이 되는데, 출력값이 -2147483648 로 음수인것을 볼 수 있다.
// 이는 int형이 2147483648 값을 표현할 수 있는 방법이 없어서 나타나는 현상이다.
// 이를 overFlow 라고 하고, 오버플로우는 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
// -2147483648는 int의 가장 작은 숫자이다.