package ex_12_DoWhile;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println(ch + " is a vowel");
            default -> System.out.println(ch + " is a consonant");
        }

    }
}
