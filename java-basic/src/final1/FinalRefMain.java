package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형

        //참조 대상의 값은 변경이 가능하다.
        data.value = 10;
        data.value = 20;
    }
}
