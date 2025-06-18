package ex_Java_Tasks;

import java.util.Scanner;

public class Leap_Year_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year%4 == 0 || year%400==0 && year%100 !=0){
            System.out.println( "The year " + "" + year + "" + " is a leap year!!");
        }
        else {
            System.out.println("The year " + "" + year + "" + " is not a leap year!!");
        }
    }
}
