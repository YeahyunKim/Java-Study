package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    // 파라미터 명과 멤버변수 명이 다르면 this를 제외할 수 있다.
}
