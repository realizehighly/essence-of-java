package oop2;

class SuperTest {
    public static void main(String args[]) {
        sChild c = new sChild();
        c.method();
    }
}

class sParent {
    int x=10;
}

class sChild extends sParent {
    int x=20;
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x="+ super.x);
    }
}
