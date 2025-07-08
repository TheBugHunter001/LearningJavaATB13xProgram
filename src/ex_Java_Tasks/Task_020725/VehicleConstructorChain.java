package ex_Java_Tasks.Task_020725;

public class VehicleConstructorChain {
    public static void main(String[] args) {
        Bike cbz = new Bike();
    }

}

class Vehicle{

    Vehicle(){
        System.out.println("Vehicle is ready!!");
    }
}

class Bike{

    Bike(){
        System.out.println("Bike is ready!!");
    }
}
