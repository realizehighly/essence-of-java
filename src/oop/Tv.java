package oop;

public class Tv {

    //////////변수
    String color;   // 색깔
    boolean power;  // 전원상태
    int channel;    // 채널


    //////////메서드
    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}
