package memory;

// 스택에 쌓이고 사라지는 LIFO 를 알아보자.

public class JavaMemoryMain1 { //메서드 영역
    public static void main(String[] args) { //스택
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) { //스택
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) { //스택
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}


