package variable;

public class Literal {
    public static void main(String[] args) {

        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        System.out.println(big);
        System.out.println(hex);

        int age = 14;
        int year = 2022;
        System.out.printf("age:%d%n", age);
        System.out.printf("age:%d year:%d%n", age,year);

        int finger = 10;
        System.out.printf("finger=[%5d]%n",finger); //finger=[   10]
        System.out.printf("finger=[%-5d]%n",finger); //finger=[10   ]
        System.out.printf("finger=[%05d]%n",finger); //finger=[00010]

        System.out.printf("hex=%x%n", hex);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("hex=%#X%n", hex);

        int binNum = 0b10;
        System.out.printf("binNum=%s%n", Integer.toBinaryString(binNum));

        double d = 1.23456789;
        System.out.printf("d=[%14.10f]%n", d); // 전체 14자리 중 소수점 아래 10자리

        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url);     //문자열의 길이만큼 출력공간을 확보
        System.out.printf("[%20s]%n", url);   //최소 20글자 출력공간 확보(우측정렬)
        System.out.printf("[%-20s]%n", url);  //최소 20글자 출력공간 확보(좌측정렬)
        System.out.printf("[%.8s]%n", url);   //왼쪽에서 8글자만 출력

    }
}
