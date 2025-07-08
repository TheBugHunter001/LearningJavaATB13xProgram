package ex_Java_Tasks.Task_080725;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        int a = 50;
        Integer b = a;
        int c = b;

        System.out.println("Primitive:" + a); //Primitive
        System.out.println("Wrapper:" + b.intValue()); //Wrapper
        System.out.println("Unboxed again:" + c); //Unboxed again


    }

}
