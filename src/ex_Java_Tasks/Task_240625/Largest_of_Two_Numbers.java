package ex_Java_Tasks.Task_240625;

import java.util.Scanner;

public class Largest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is the Largest!!");
        }
        else {
            System.out.println(num2 + " is the Largest!!");
        }
    }
}
