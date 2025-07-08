package ex_Java_Tasks.Task_230625;

import java.util.Scanner;

public class Person_is_Eligible_to_Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age to validate for voting");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not allowed to vote!");
        }
    }
}
