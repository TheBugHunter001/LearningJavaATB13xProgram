package ex_Java_Tasks.Task_020725;

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1.makeSound();
        c1.meow();
    }
}


    class Animal {

        void makeSound() {
            System.out.println("Animal is making a sound!!");
        }

    }

        class Cat extends Animal {
            void meow() {
                System.out.println("Cat is meowing!!");
            }
        }
