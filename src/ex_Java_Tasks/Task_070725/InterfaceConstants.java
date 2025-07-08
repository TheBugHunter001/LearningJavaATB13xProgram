package ex_Java_Tasks.Task_070725;

public class InterfaceConstants {
    public static void main(String[] args) {
    NewCar duster = new NewCar();
    duster.carSpeed();

    }
}

interface SpeedLimit{

    int MAX_SPEED = 120;

}

class NewCar implements SpeedLimit{

    void carSpeed(){
        System.out.println("Max Speed is: " + MAX_SPEED);
    }

}
