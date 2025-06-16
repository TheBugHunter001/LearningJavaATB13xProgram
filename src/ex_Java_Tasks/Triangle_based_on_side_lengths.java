package ex_Java_Tasks;

import java.util.Scanner;

public class Triangle_based_on_side_lengths {
    public static void main(String[] args) {
        Scanner Side1 = new Scanner(System.in);
        System.out.println("Enter length for L1");
        int L1 = Side1.nextInt();

        Scanner Side2 = new Scanner(System.in);
        System.out.println("Enter length for L2");
        int L2 = Side2.nextInt();

        Scanner Side3 = new Scanner(System.in);
        System.out.println("Enter length for L3");
        int L3 = Side3.nextInt();

        if (L1 == (L2 = L3)) {
            System.out.println("Triangle is equilateral");
        }
        else if (L1 == L2 & L2 == L3) {
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("Triangle is isosceles");
        }
    }
}
