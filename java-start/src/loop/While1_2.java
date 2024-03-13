package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;


        // 3번 작동함 1, 2, 3
        while (count < 3) {
            count = ++count;
            System.out.println("현재 숫자는: " + count);
        }


    }
}
