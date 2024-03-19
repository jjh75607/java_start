package basic.oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("플레이어 실행");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("on volume = " + volume);
        } else {
            System.out.println("off");
        }
    }
}
