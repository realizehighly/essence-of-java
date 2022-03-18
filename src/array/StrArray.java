package array;

public class StrArray {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(System.identityHashCode(str));

        str = str+ "8";           // "Java8"이라는 새로운 문자열이 str에 저장된다.
        System.out.println(System.identityHashCode(str));

        System.out.println(str);  // "Java8" 출력

        char[] chArr = {'A','B','C'};
        String str2 = new String(chArr);
        char[] tmp = str2.toCharArray();


    }
}
