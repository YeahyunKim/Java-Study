package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();

        //볼륨 증가
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태 확인
        player.showStatus();

        //음악 플레이어 종료
        player.off();
    }
    // 객체 지향 프로그래밍 덕분에 음악 플레이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 친숙하게 느껴진다.
    // 그래서 코드가 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬워진다. 예를 들어서 MusicPlayer 내부 코드가
    // 변하는 경우에는 다른 코드는 변경하지 않아도 된다. MusicPlayer의 volume이라는 필드 이름이 다른 이름으로 변한다고 할 때 MusicPlater 내부만
    // 변경하면 된다. 또 음악 플레이어가 내부에서 출력하는 메세지를 변경할 때도 MusicPlayer 내부만 변경하면 된다. 이 경우 MusicPlayer를
    // 사용하는 개발자는 코드를 전혀 변경하지 않아도 된다. 물론 외부에서 호출하는 MusicPlater의 메서드 이름을 변경한다면 MusicPlayer를 사용하는 곳의 코드도 변경해야한다.
}
