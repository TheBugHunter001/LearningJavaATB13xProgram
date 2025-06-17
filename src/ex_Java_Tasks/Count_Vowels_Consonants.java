package ex_Java_Tasks;

import java.util.Scanner;

public class Count_Vowels_Consonants {
    public static void main(String[] args) {

        //Define variables for store count of vowels and consonants

        int vowels=0;
        int consonants=0;

        //Input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        for(int i=0;i<str.length();i++){
            char c=str.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels  "+vowels+" Consonants  "+consonants);

    }

}
