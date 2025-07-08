package ex_Java_Tasks.Task_270625;

import java.util.Scanner;

public class Pyramid_with_Star_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of * rows to print!!");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for (int j=0;j<(n-1-i); j++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
