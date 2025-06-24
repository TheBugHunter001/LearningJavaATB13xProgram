package ex_Java_Tasks_24th_Jun;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        int account_balance = 10000;
        System.out.println("Display account balance: " + account_balance);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        int withdrawal_amount = sc.nextInt();

        if (withdrawal_amount>0 && withdrawal_amount%100==0 && withdrawal_amount<=account_balance){
            System.out.println("User should be able to withdraw: " + withdrawal_amount);
            int updated_balance = account_balance-withdrawal_amount;
            System.out.println(updated_balance);
        }
        else {
            System.out.println("Unable to withdraw: " + withdrawal_amount);
        }
    }
}
