package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";

        //인스턴스를 생성하지 않고 deco() 함수를 클래스에서 바로 사용할 수 있다.
        String deco = DecoUtil2.deco(s);
    }
}
