package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //2행, 1열
        arr[1][2] = 6; //3행, 2열

        for (int row = 0; row < 2; row++) {
            // 0행 출력
            System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");
            System.out.println(" "); // 0행 출력 후 라인 변경
        }
    }
}
