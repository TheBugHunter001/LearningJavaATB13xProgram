package ex_Java_Tasks;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the grade");
        int number = sc.nextInt();

        if (number >= 90 && number <= 100){
            System.out.println("Grade A achieved !!");
        }
        else if (number >= 80 && number <= 89) {
            System.out.println("Grade B achieved !!");
        }
        else if (number >= 70 && number <= 79) {
            System.out.println("Grade C achieved !!");
        }
        else if (number >= 60 && number <= 69) {
            System.out.println("Grade D achieved !!");
        }
        else if (number >= 0 && number <= 59) {
            System.out.println("Grade D achieved !!");
        }
        else {
            System.out.println("Invalid grade !!");
        }
    }
}
