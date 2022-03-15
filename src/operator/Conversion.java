package operator;

public class Conversion {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.0f;

        float result = f + (float)i; // 형변환으로 두 피연산자의 타입을 일치
        float result2 = f + i;        // 큰 타입으로 형변환시 , 형변환 연산자 생략 가능

        System.out.println(result+" "+result2);
    }
}
