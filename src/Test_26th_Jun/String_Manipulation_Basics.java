package Test_26th_Jun;

public class String_Manipulation_Basics {
    public static void main(String[] args) {
        String a = "Test1";
        String b = "Test2";
        String c = "Test3";
        String d = "Test4";
        String e = "Test5";

        System.out.println(a.concat(b)); // a+b should be printed
        System.out.println(a.length()); // total length of a should be printed
        System.out.println(c.substring(1,4)); //From index 1 to index 4 should be printed
        System.out.println(a.charAt(4)); // index at 4 should be printed
    }
}
