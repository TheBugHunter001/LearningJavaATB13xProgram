package ex_Java_Tasks.Task_270625;

import java.util.Scanner;

public class ConvertDaysIntoYearsMonthsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the days to convert into Years, Months and Days!!");
        int Inputdays = scanner.nextInt();

        int years = Inputdays/365;
        int remainingDays = Inputdays%365;
        System.out.println(remainingDays);
        int months = remainingDays/30;
        int days = remainingDays%30;

        System.out.println(Inputdays + " Inputdays = " + years + " years, " + months + " months, and " + days + " days.");

    }
}
