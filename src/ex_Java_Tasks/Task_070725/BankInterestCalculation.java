package ex_Java_Tasks.Task_070725;

public class BankInterestCalculation {
    public static void main(String[] args) {
    SBI sbiBank = new SBI();
    sbiBank.getInterestRate();

    HDFC hdfcBank = new HDFC();
    hdfcBank.getInterestRate();

    }
}

abstract class Bank{

    abstract void getInterestRate();

}

class SBI extends Bank{


    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{


    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}