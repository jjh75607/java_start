package basic.static2;

import static basic.static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        staticCall();

        DecoData data1 = new DecoData();
        data1.instanceCall();

        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
