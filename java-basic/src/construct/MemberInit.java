package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void createMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //파라미터 명과 멤버 변수의 명의 다르면 this를 생략할 수 있다.
    //자바는 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어준다.
    //생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다. <== 주의
}

