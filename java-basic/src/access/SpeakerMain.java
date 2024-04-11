package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        //이렇게 되면 문제가 생긴다.
        //Speaker 클래스내의 volumeUp() 메서드에는 볼륨이 100이상 넘어가지 않도록 설정하는 조건문이 있는데,
        //이렇게 필드에 직접 접근할 수 있게되면 문제가 발생한다. 이를 접근제어자로 처리할 수 있다.
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
        speaker.showVolume();

    }
}
