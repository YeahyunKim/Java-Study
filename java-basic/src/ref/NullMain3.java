package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println("bigData.count = " + bigData.count); // 초기값 0
        System.out.println("bigData.count = " + bigData.data); // 참조형이기 때문에 null

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);

        //bigData.data를 출력하면 null이 출력된다ㅏ. 이 변수는 아직 아무것도 참조하고 있지 않다.
        //bigData.data.value를 출력하면 data의 값이 null이므로 참조할 곳이 없어 NullPointerException 예외가 발생하게 된다.

    }
}
