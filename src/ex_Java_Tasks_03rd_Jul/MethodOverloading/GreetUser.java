package ex_Java_Tasks_03rd_Jul.MethodOverloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.greet();
        g1.greet("Test user");
    }

}

class Greeter{

    void greet(){
        System.out.println("Hello!!");

    }

    String greet(String name){
        System.out.println("Hello,"+name+"!");
        return name;

    }
}
