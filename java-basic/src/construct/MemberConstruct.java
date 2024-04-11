package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
    //생성자는 1개 이생 성성할 수 있다.
    //이를 오버로딩 이라고 하는데, 성적 입력이 꼭 필요하지 않는경우에는 위의 생성자를 호출하면 된다.
    //this()는 생성자 코드의 첫줄에만 작성할 수 있다.
    //this()를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다.

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
