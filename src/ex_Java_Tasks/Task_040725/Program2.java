package ex_Java_Tasks.Task_040725;

public class Program2 {
    public static void main(String[] args) {
    Car viper = new Car();
    viper.method();
    }
}

class Vehicle {

    void method(){
        System.out.println("Vehicle started!!");
    }
}

class Car extends Vehicle {

    void method() {
        super.method();
    }
}
