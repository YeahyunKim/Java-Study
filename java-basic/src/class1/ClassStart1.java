package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";

        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 15;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);

        //위 코드는 학생들을 하나 추가할 때 마다 변수를 계속해서 선언해 주어야 하므로 좋은 코드가 아니다.
    }
}
