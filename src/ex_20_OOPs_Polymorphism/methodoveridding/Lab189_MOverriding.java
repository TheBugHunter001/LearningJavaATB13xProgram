package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cow c1 = new Cow();
        c1.sound();
    }

}

class Animal {

    void sound(){
        System.out.println("Default sound!");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Bark");
    }
}

class Cow extends Animal{
    void sound() {
        System.out.println("Moo");
    }
}