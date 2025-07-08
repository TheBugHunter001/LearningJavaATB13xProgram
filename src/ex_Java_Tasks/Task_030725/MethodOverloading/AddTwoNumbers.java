package ex_Java_Tasks.Task_030725.MethodOverloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5,7));
        System.out.println(c1.add(4.7,9.2));
    }

}

class Calculator {

    int add (int a,int b){
        return a + b;

    }

    double add (double a,double b){
        return a + b;

    }
}
