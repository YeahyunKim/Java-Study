package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();

        dataA.value = 10;

        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); //10

        changeReference(dataA);

        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); //20

    }
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }

    // dataA는 참조형이기 때문에 파라미터 dataX에 동일한 주소값을 복사해서 전달해준다.
    // 따라서 dataX.value 는 dataA와 동일한 메모리 위치와 값을 가지고 있기 때문에 dataX를 변경하면 dataA의 값 또한 바뀌게 된다.
}
