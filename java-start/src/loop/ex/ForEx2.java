package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int i = 0;

        for (int count = 1; ; count++) {
            if (count % 2 == 0 && i < 10) {
                System.out.println(count);
                i++;
                continue;
            }
        }
    }
}
