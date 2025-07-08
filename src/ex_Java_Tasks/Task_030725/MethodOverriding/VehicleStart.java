package ex_Java_Tasks.Task_030725.MethodOverriding;

public class VehicleStart {
    public static void main(String[] args) {
        Bike cbz = new Bike();
        cbz.start();
        Car esteem = new Car();
        esteem.start();
    }


}

class Vehicle{

    void start(){
        System.out.println("The vehicle starts!!");
    }
}

class Bike extends Vehicle{

    @Override
    void start(){
        System.out.println("Kick start the bike!!");
    }
}

class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Turn the key to start the car!!");
    }
}
