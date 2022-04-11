package javalangpackage;

public class StringEx {
    public static void main(String[] args) {
        String s = new String("abc");
        String s2 = new String("abc");
        boolean b = (s==s2);                     // b = false
        boolean b2 = s.equals(s2);               // b2 = true
        boolean b3 = (s.intern()==s2.intern());  // b3 = true

    }
}
