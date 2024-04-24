package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";

        //인스턴스를 생성해야만 deco() 함수를 사용할 수 있다.
        DecoUtil1 decoUtil = new DecoUtil1();

        System.out.println(decoUtil.deco(s));
    }
}
