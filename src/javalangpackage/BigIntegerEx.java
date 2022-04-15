package javalangpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerEx {
    public static void main(String[] args) {
        BigInteger val;
        val = new BigInteger("12345678901234567890"); // 문자열로 생성
        val = new BigInteger("FFFF", 16);      // n진수(radix)의 문자열로 생성
        val = BigInteger.valueOf(1234567890L);        // 숫자로 생성

        String s = val.toString();
        val.intValue();


        BigDecimal val2 = new BigDecimal("123.45");
        System.out.println(val2.unscaledValue());
        System.out.println(val2.scale());
        System.out.println(val2.precision());

        BigDecimal bigd = new BigDecimal("1.0");
        BigDecimal bigd2 = new BigDecimal("3.0");

        //System.out.println(bigd.divide(bigd2));   // 딱 떨어지는 결과가 아니므로 ArithmeticException발생
        System.out.println(bigd.divide(bigd2, 4, RoundingMode.HALF_UP));  // 0.333 ( 3자리에서 반올림 )
    }
}
