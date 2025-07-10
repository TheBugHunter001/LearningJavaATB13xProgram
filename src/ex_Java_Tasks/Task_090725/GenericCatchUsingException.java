package ex_Java_Tasks.Task_090725;

import java.util.Scanner;

public class GenericCatchUsingException {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter 1st value!!");
        int a = num.nextInt();

        System.out.println("Enter 2nd value as 0!!");
        int b = num.nextInt();



        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

