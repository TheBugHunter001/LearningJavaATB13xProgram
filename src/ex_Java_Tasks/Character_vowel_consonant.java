package ex_Java_Tasks;

import java.util.Scanner;

public class Character_vowel_consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check if it is a vowel or a consonant");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch + " is a vowel.");
        }
        else {
            System.out.println(ch + " is a consonant." );
        }

    }
}
