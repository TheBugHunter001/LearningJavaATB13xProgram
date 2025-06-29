package ex_Java_Tasks_27th_Jun;

import java.util.Scanner;

public class NumberIsDivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to validate if it is divisible by 5 && 11");

        int num = scanner.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println(num + " is divisible by 5 && 11!! ");
        }
        else {
            System.out.println(num + " is not divisible by 5 && 11!!");
        }
    }
}
