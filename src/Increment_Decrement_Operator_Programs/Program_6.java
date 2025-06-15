package Increment_Decrement_Operator_Programs;

public class Program_6 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        //  Exp and Result Table
        // Line No. |  a |  Exp
        // 5 | 5 | NA
        // 6 | 28 | 5 + 7 + 7 + 9 = 28
        // 7 | x:9 | NA
        // 8 | y:28 | NA
    }
}
