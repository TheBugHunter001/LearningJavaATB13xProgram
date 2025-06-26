package Test_26th_Jun;

public class String_Comparison_and_Equality {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("HELLO");
        String c = "World";
        String d = new String("WORLD");

        System.out.println(a==b);
        System.out.println(c.equals(d));
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(a.compareTo(b));
    }
}
