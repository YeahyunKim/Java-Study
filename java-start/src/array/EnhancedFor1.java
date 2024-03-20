package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }

        //향상된 for문
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        //향상된 for문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);

        }
    }
}

// 향상된 for문을 활용하면, 배열안의 값을 모두 가져올 수 있다.