package ex_Java_Tasks.Task_030725.MethodOverriding;

public class AnimalSounds {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Cow cow = new Cow();
        cow.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("Animal making a sound!!");
    }
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark!!");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Meow!!");
    }
}

class Cow extends Animal{

    @Override
    void sound(){
        System.out.println("Moo!!");
    }
}
