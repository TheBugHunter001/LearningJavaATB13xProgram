package ex_Java_Tasks.Task_070725;

public class InterfaceWithDefaultAndStaticMethod {
    public static void main(String[] args) {
    Car mazda = new Car();
    mazda.start();
    Vehicle.fuelType();

    }
}

interface Vehicle{

    default void start(){

        System.out.println("Vehicle started!!");
    }

    static void fuelType(){

        System.out.println("Fuel type is Petrol!!");
    }
}

class Car implements Vehicle{

}
