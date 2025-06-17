package ex_Java_Tasks;

import java.util.Scanner;

public class Palindrome_of_String {
    public static void main(String[] args) {

        //Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        str = str.toLowerCase();

        String revstr = "";

        for (int i = 0; i < str.length(); i++) {
            revstr = str.charAt(i)+revstr;
        }
        if (str.equals(revstr)){
            System.out.println("It is a palindrome string");
        }
        else {
            System.out.println("It is not a palindrome string");
        }


    }

}
