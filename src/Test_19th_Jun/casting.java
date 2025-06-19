package Test_19th_Jun;

public class casting {
    public static void main(String[] args) {
        int a = 300;
        byte b = (byte) a;
        System.out.println(b); // narrowing

        int x = 5;
        float y = x;
        System.out.println(y); //widening
    }
}
