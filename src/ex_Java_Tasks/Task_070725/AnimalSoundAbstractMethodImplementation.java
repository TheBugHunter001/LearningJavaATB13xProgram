package ex_Java_Tasks.Task_070725;

public class AnimalSoundAbstractMethodImplementation {
    public static void main(String[] args) {
    Dog K9 = new Dog();
    K9.makeSound();

    Cat Percy = new Cat();
    Percy.makeSound();

    }
}


abstract class Animal{

    abstract void makeSound();
}

class Dog extends Animal{


    @Override
    void makeSound() {
        System.out.println("The Dog barks!!");
    }
}

class Cat extends Animal{


    @Override
    void makeSound() {
        System.out.println("The Cat meows!!");
    }
}