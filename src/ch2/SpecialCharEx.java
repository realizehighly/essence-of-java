package ch2;

public class SpecialCharEx {

    public static void main(String[] args) {
        System.out.println('\\');
        System.out.println('\'');
        System.out.println("ab\bc"); // \b에 의해 b가 지워짐
        System.out.println("\"\"");
        System.out.println("ab\f");
    }
}
