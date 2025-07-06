package ex_Java_Tasks_04th_Jul;

public class Program6 {
    public static void main(String[] args) {
    Dog Chelsea = new Dog();
    Chelsea.doEat();

    }
}

class Animal{

    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    void doEat(){
        super.eat();
    }
}
