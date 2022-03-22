package oop;

public class Variables {

    // 클래스 영역
    int iv;            // 인스턴스 변수
    static int cv;     // 클래스 변수(static변수, 공유변수)

    void method()
    {
        //메서드 영역
        int lv = 0;    // 지역 변수
    }

    float divide(int x, int y){
        //작업을 하기 전에 나누는 수(y)가 0인지 확인하다.
        if(y==0){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0; // 매개변수가 유효하지 않으므로 메서드를 종료한다.
        }
        return x / (float)y;
    }
}
