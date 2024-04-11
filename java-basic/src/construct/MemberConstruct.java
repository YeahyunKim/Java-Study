package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " | age = " + age + " | grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
    // - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 처서 글자도 대문자로 시작한다.
    // - 생성자의 변환 타입이 없다. 비워두어야 한다.
    // - 나머지는 메서드와 같다.
}