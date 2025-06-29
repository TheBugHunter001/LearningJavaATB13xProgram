package ex_Java_Tasks_27th_Jun;

import java.util.Scanner;

public class PersonIsSeniorCitizenBasedOnAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age to validate if the person is Senior Citizen Based on Age");
        int age = scanner.nextInt();

        if(age>0 && age<=12){
            System.out.println(age + " The person is a Child!!");
        } else if (age>=13 && age<=19) {
            System.out.println(age + " The person is a Teenager!!");
        } else if (age>=20 && age<=64) {
            System.out.println(age + " The person is an Adult!!");
        } else {
            System.out.println(age + " The person is a Senior Citizen!!");
        }
    }
}
