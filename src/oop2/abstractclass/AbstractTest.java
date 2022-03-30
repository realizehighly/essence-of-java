package oop2.abstractclass;

abstract class Player{
    abstract void play(int pos); // 추상메서드
    abstract void stop();        // 추상메서드
}

class AudioPlayer extends Player{

    @Override
    void play(int pos) {   // 추상메서드를 구현
        // ...
    }

    @Override
    void stop() {          // 추상메서드를 구현
        // ...
    }
}

abstract class AbstractPlayer extends Player{

    @Override
    void play(int pos) {   // 추상메서드를 구현
        // ...
    }

}


public class AbstractTest {
    public static void main(String[] args) {

    }
}
