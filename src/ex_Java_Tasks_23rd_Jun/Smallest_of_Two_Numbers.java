package ex_Java_Tasks_23rd_Jun;

import java.util.Scanner;

public class Smallest_of_Two_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int result = Math.min(num1,num2);
        System.out.println(result + " is Smaller!!");

    }
}
