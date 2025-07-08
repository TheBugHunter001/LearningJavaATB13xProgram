package ex_Java_Tasks.Task_230625;

import java.util.Scanner;

public class Number_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }
    }
}
