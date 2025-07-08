package ex_Java_Tasks.Task_030725.MethodOverloading;

public class PrintData {
    public static void main(String[] args) {
        Printer print = new Printer();
        System.out.println(print.printData("Test user"));
        System.out.println(print.printData(5));
        System.out.println(print.printData(9.8F));

    }
}

class Printer{


   String printData(String username) {
       return username;
   }

    int printData(int number) {
        return number;
    }

    float printData(float num) {
        return num;
    }
}
