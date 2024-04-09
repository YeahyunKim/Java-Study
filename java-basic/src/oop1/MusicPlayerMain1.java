package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이러를 시작합니다.");

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        // 절차지향 프로그램은 코드를 작성한 순서대로 프로그램이 동작하는것을 말한다.
        //[출력 결과]
        //음악 플레이러를 시작합니다.
        //음악 플레이어 볼륨 : 1
        //음악 플레이어 볼륨 : 2
        //음악 플레이어 볼륨 : 1
        //음악 플레이어를 종료합니다.
    }
}
