package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        //  Exp and Result Table
        // Line No | a | Result b
        // 7 | 10 | 11
        // 8 | 11 | 11

        // 12 | 10 | 11
        // 13 | 11 | 11
    }

}
