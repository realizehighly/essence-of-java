package oop2;

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //...
    }

    public static Singleton getInstance() {
        return s;
    }

    //...
}

class SingletonTest {
    public static void main(String args[]) {
//             Singleton s = new Singleton();       // 에러!!! Singleton() has private access in Singleton
        Singleton s1 = Singleton.getInstance();
    }
}