package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 : " + num1);

        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1 : " + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
// 변수와 파라미터의 명칭이 같아도, 변수의 값을 복사해서 전달하는 자바에서는 다른 값이 출력된다.