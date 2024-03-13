package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {

            if (i >= 10) {
                System.out.println("i 값이 10보다 커졌습니다. " + i);
                break;
            }
        }


    }
}
