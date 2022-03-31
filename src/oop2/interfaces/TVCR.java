package oop2.interfaces;

public class TVCR extends Tv implements IVCR {
    VCR vcr = new VCR();
    public void play() {
        vcr.play();   // 코드를 작성하는 대신 VCR인스턴스의 메서드를 호출하면 된다.
    }
    public void stop() {
        vcr.stop();
    }
    public void reset() {
        vcr.reset();
    }
    public int getCounter() {
        return vcr.getCounter();
    }
    public void setCounter(int c) {
        vcr.setCounter(c);
    }
}