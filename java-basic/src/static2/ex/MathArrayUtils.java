package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    public static double average(int[] values) {
        return sum(values) / values.length;
    }

    public static int min(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (result > value) {
                result = value;
            }
        }
        return result;
    }

    public static int max(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (result < value) {
                result = value;
            }
        }
        return result;
    }


}
