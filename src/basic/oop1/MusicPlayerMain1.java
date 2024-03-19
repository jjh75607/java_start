package basic.oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        System.out.println("start");
        isOn = true;

        volume++;
        System.out.println("volume = " + volume);

        volume++;
        System.out.println("volume = " + volume);

        volume--;
        System.out.println("volume = " + volume);

        if (isOn){
            System.out.println("volume = " + volume);
        } else {
            System.out.println("x");
        }

        isOn = false;
    }
}
