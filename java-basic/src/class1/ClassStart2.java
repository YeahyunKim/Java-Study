package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrade[i]);
        }

        //위 코드는 변수 하나로 학생들을 관리할 수 있어 어느정도 사용성이 있게 만들어져 있지만, 관리하기에 용이하지 못하다.
        //만약 학생2번의 데이터를 지워야한다면, 각 배열별 2번째 데이터를 지워야하는데 사람이 실수로 3번쨰 데이터를 지우게 되면...
        //즉 사람이 손수 관리해야 하기 때문에, 안전하지 못하다.
    }
}
