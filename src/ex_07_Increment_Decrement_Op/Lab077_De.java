package ex_07_Increment_Decrement_Op;

public class Lab077_De {
    public static void main(String[] args) {
        int a = 10;
        int result_post = a--;
        System.out.println(result_post); // 10
        System.out.println(a); //9

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 10 | NA
        // 7 | 10 | NA
        // 8 | 9 | NA
    }
}
