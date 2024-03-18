package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue = " + doubleValue);
    }
}

// 자바는 기본적으로 같은 타입에 값을 대입할 수 있다. 하지만 위에서 본것과 같이
// 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다.