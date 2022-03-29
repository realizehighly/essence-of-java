package oop2;

public class StaticTest {
    static int width = 200;         // 클래스변수(static변수)
    static int height = 120;        // 클래스변수(static변수)

    static{                         // 클래스 초기화 블럭
        // static변수의 복잡한 초기화 수행
    }

    static int max(int a, int b){   // 클래스메서드(static메서드)
        return a>b?a:b;
    }
}
