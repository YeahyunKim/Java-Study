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
}

