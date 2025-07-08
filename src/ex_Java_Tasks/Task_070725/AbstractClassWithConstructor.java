package ex_Java_Tasks.Task_070725;

public class AbstractClassWithConstructor {
    public static void main(String[] args) {

        Display print = new Display();
        print.MethodToPrint();
    }
}

abstract class ConstructorAbstract{

    ConstructorAbstract(){
        System.out.println("Validate that abstract class can have constructor!!");
    }

    void MethodToPrint(){
        System.out.println("Validate that abstract class has a concrete method!!");

    }
}

class Display extends ConstructorAbstract{


}