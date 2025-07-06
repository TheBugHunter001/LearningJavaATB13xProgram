package ex_Java_Tasks_02nd_Jul;

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
