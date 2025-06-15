package Increment_Decrement_Operator_Programs;

public class Program_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);

        //  Exp and Result Table
        // Line No. |  a |  Exp
        // 5 | 5 | NA |
        // 6 | 5 | 6
        // 7 | a: 6 , b: 5 | "a: " 6 , "b:" 5
    }
}
