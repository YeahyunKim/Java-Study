package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " | 나이 : " + member.age + " | 점수 : " + member.grade);
        }

        //생성자는 인스턴트를 생성ㅎ고 나서 즉시 호출된다. 생성자를 호출하는 방법은 new 명령어 다음에 생성자 이름과
        //매개변수에 맞추어 인수를 전달하면 된다. 위와 같이 코드를 작성하면, 인스턴트를 생성하고 즉시 해당 생성자를 호출한다.
    }
}
