package Test_19th_Jun;

public class Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        int c = a++;
        int d = --a;
        int e = a--;
        System.out.println(a); // a = 10
        System.out.println(b); // a = 11, b = 11
        System.out.println(c); // a = 12, b = 11, c = 11
        System.out.println(d); // a = 11, b = 11, c = 11, d = 11
        System.out.println(e); // a = 10, b = 11, c = 11, d = 11, e = 11

    }
}
