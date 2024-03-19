package basic.oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        System.out.println("start");
        data.isOn = true;

        data.volume++;
        System.out.println("volume = " + data.volume);

        data.volume++;
        System.out.println("volume = " + data.volume);

        data.volume--;
        System.out.println("volume = " + data.volume);

        if (data.isOn) {
            System.out.println("volume = " + data.volume);
        } else {
            System.out.println("x");
        }

        data.isOn = false;
    }
}
