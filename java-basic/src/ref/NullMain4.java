package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count); // 초기값 0
        System.out.println("bigData.count = " + bigData.data); // 참조값을 주어서 정상 출력

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); // 초기값 0

    }
}
