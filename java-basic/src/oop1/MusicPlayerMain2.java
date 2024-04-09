package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 증가
        volumeUp(data);

        //볼륨 감소
        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기
        off(data);

    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어가 켜졌습니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어가 꺼졌습니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }

    // 절차지향 프로그램은 코드를 작성한 순서대로 프로그램이 동작하는것을 말한다.
    // 위의 코드는 각가의 기능을 메서드로 만든 덕분에 각가의 기능이 모듈화 되었다.
    // 1. 중복 제거 : 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
    // 2. 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
    // 3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.

    // 모듈화란?
    // 레고 블럭을 생각해보자. 필요한 블럭을 가져다 꼽아서 사용할 수 있다. 여기서는 음악 플레이어의 기능이 필요하면 해당
    // 기능을 메서드 호출 만으로 손쉽게 사용할 수 있다. 이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성할 수 있다.
}
