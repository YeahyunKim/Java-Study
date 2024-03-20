package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("~~~~프로그램이 동작 중 입니다~~~~");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; //void 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        return; //void 경우 생략 가능
    }


}

//add(a, b) 라는 메소드를 추가하여, 코드를 더 간결하게 바꿀 수 있다.