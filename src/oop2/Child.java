package oop2;

class Parent{
    int age;

}

public class Child extends Parent {
    void play(){
        System.out.println("놀자~");
    }

    public static void main(String[] args) {
        Child c = new Child();

    }
}
