package Increment_Decrement_Operator_Programs;

public class Program_5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //  Exp and Result Table
        // Line No. |  a |  Exp
        // 5 | 5 | NA
        // 6 | 12 | 5+7 = 12
        // 7 | a:7 | NA
        // 8 | b:12 | NA

    }
}
