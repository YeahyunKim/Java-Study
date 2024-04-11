package pack;
//패키지를 사용하는 경우 항상 코드 첫줄에 package pack 과 같은 패키지 이름을 적어주어야 한다.
public class Data {

    //기본생성자 직접 생성
    public Data() {
        System.out.println("패키지 pack Data 생성");
    }

    public static class PackageMain1 {
        public static void main(String[] args) {
            Data data = new Data();
        }
    }
}
