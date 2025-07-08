package ex_Java_Tasks.Task_230625;

import java.util.Scanner;

public class Character_is_a_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to validate if it is a vowel or a consonant!");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel!!");
        }
        else {
            System.out.println(ch + " is a consonant!!");
        }
    }

}
