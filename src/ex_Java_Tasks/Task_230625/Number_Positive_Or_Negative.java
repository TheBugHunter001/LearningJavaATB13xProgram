package ex_Java_Tasks.Task_230625;

import java.util.Scanner;

public class Number_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is Positive");
        }
        else if (num < 0){
            System.out.println(num + " is Negative");
        }
        else {
            System.out.println(num + " is Zero");
        }
    }
}
