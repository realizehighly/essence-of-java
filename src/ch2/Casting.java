package ch2;

public class Casting {
    public static void main(String[] args) {
        double d = 1.0e100;  // float의 최대값보다 큰 값을 d에 저장
        float f = (float)d;  // d의 값을 float로 형변환해서 f에 저장. f는 무한대

        double d2 = 1.0e-50;  // float의 최소값보다 작은 값을 d에 저장
        float f2 = (float)d2;  // f의 값은 0

        System.out.println(d);
        System.out.println(f);
        System.out.println(f2);
    }
}
