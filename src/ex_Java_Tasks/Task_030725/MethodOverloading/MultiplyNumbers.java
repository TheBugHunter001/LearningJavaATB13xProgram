package ex_Java_Tasks.Task_030725.MethodOverloading;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println(m1.multiply(7,4));
        System.out.println(m1.multiply(6,9,2));
    }

}

class MathOperations{

    int multiply(int a,int b){
        return a * b;
    }

    int multiply(int a,int b,int c){
        return a * b * c;
    }
}