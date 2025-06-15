package ex_07_Increment_Decrement_Op;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 22 | 11+12 -> 23
        // 7 | 12 | NA
    }
}
