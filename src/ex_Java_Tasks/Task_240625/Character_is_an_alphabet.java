package ex_Java_Tasks.Task_240625;

import java.util.Scanner;

public class Character_is_an_alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to check character is alphabet or not!");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch<='z'){
            System.out.println(ch + " is an alphabet!!");
        }
        else {
            System.out.println(ch + " is not an alphabet!!");
        }

    }
}
