package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        createMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        createMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + " | 나이 : " + member.age + " | 점수 : " + member.grade);
        }

    }
    static void createMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
