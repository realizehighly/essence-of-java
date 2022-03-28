package oop2;

import java.io.IOException;
import java.sql.SQLException;

class Parent2 {
    void parentMethod() throws IOException, SQLException {
        //..
    }
}

class Child3 extends Parent2 {
    void parentMethod() throws IOException {  // 예외 개수 적으므로 바른 오버라이딩
        //..
    }
    //..
}

//class Child4 extends Parent2 {
//    void parentMethod() throws Exception {  // 예외 개수 적으니까 바른 오버라이딩인가? 아니다.
//        //..                              // Exception은 모든 예외의 최고 조상이므로 가장 많은 개수의 예외이다.
//    }
//    //..
//}


public class OverridingTest {
    public static void main(String[] args) {

    }
}
