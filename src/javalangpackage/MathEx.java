package javalangpackage;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathEx {
    public static void main(String args[]) {
        double val = 90.7552;
        out.println("round("+ val +")=" + round(val));  // 반올림

        val *= 100;
        out.println("round("+ val +")=" + round(val));  // 반올림

        out.println("round("+ val +")/100  =" + round(val)/100);  // 반올림
        out.println("round("+ val +")/100.0=" + round(val)/100.0);  // 반올림
        out.println();
        out.printf("ceil(%3.1f)=%3.1f%n",  1.1, ceil(1.1));   // 올림
        out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));  // 버림
        out.printf("round(%3.1f)=%d%n",    1.1, round(1.1));  // 반올림
        out.printf("round(%3.1f)=%d%n",    1.5, round(1.5));  // 반올림
        out.printf("rint(%3.1f)=%f%n",     1.5, rint(1.5));   // 반올림
        out.printf("round(%3.1f)=%d%n",   -1.5, round(-1.5)); // 반올림
        out.printf("rint(%3.1f)=%f%n",    -1.5, rint(-1.5));  // 반올림
        out.printf("ceil(%3.1f)=%f%n",    -1.5, ceil(-1.5));  // 올림
        out.printf("floor(%3.1f)=%f%n",   -1.5, floor(-1.5)); // 버림

        int x1=1, y1=1;  // (1, 1)
        int x2=2, y2=2;  // (2, 2)

        double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
        double a = c * sin(PI/4);  // PI/4 rad = 45 degree
        double b = c * cos(PI/4);
//		double b = c * cos(toRadians(45));

        out.printf("a=%f%n", a);
        out.printf("b=%f%n", b);
        out.printf("c=%f%n", c);
        out.printf("angle=%f rad%n", atan2(a,b));
        out.printf("angle=%f degree%n%n", atan2(a,b) * 180 / PI);
//		out.printf("angle=%f degree%n%n", toDegrees(atan2(a,b)));

        out.printf("24 * log10(2)=%f%n",   24 * log10(2));  // 7.224720
        out.printf("53 * log10(2)=%f%n%n", 53 * log10(2));  // 15.954590
    }

}
