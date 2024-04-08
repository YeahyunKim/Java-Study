package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a); //10

        //메서드 호출로 a값 바꾸기 시도
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a); //10
    }

    public static void changePrimitive(int a) {
        a = 20;
    }
    //메서드를 호출해도 a는 기본형이기 때문에 파라미터에 값을 복사해서 전달해준다.
    //따라서 파라미터의 x는 a와 다른 메모리 주소값을 가지고 있으므로 a의 값이 바뀌지 않는다.
}
