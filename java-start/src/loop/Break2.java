package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;) {

            if (i >= 10) {
                System.out.println("i 값이 10보다 커졌습니다. " + i);
                break;
            }
        i++;
        }


    }
}
