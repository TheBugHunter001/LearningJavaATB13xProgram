package ex_Java_Tasks_24th_Jun;

import java.util.Scanner;

public class Triangle_is_valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for side 1");
        int side1 = sc.nextInt();

        System.out.println("Enter value for side 2");
        int side2 = sc.nextInt();

        System.out.println("Enter value for side 3");
        int side3 = sc.nextInt();

        if (side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            System.out.println("It is a triangle!!");
        }
        else {
            System.out.println("It is not a triangle!!");
        }


    }
}
