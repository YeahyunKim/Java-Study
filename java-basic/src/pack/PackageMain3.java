package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB= new pack.b.User();

        //다른 패키지에 같은명의 클래스가 있을 때에는 가장 자주 사용하는 클래스를 임포트하고,
        //그렇지 않는 클래스는 경로를 입력하여 불러오는게 헷갈리지 않고 좋다.
    }
}
