package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size = scanner.nextInt();

        int numbers [] = new int[size];

        for (int i = 0; i <numbers.length ; i++){
            System.out.println("Enter the numbers");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("---- Below Code is printing the elements!");

        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
