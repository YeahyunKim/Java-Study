package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        //숫자 1000을 보면 이게 뭘 의미하는 숫자인지 알 수 없고, 나를 당황하게 만든다.
        //이를 magic number라고 부른다. 이를 해결하기 위해 우리는 상수로 이를 처리해야한다.
        System.out.println("[최대 참여자 수 : " + 1000 + "]");
        int currentUsers = 999;

        process(currentUsers++);
        process(currentUsers++);
        process(currentUsers++);
        process(currentUsers++);

    }
    private static void process(int currentUsers){
        System.out.println("현재 참여자 수 : " + currentUsers);
        if (currentUsers > 1000) {
            System.out.println("대기자로 등록합니다.");
            System.out.println();
        } else {
            System.out.println("참여자로 등록합니다.");
            System.out.println();
        }
    }
}
