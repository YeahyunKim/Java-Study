package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data= " + data);
        data = new Data();
        System.out.println("2. data= " + data);
        data = null;
        System.out.println("3. data= " + data);

        //null을 할당한 순간, 기존 new Data()에 의해 생성된 참조값을 다시 구할 방법이 없다. 따라서 해당 인스턴스에 다시 접근할 방법이 없다.
        //이렇게 되면 아무도 참조하지 않는 인스턴스는 사용되지 않고, 메모리 용량만 차지할 뿐이다.
        //여기서 자바는 GC(GarbaeCollection)가 사용하지 않는 인스턴스를 모두 제거를 해준다.
    }
}
