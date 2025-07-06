package ex_Java_Tasks_04th_Jul;

public class Program4 {
    public static void main(String[] args) {

        Cashier c1 = new Cashier();
        c1.money();
        System.out.println("----------------");
        System.out.println(c1.setAmount(100000000000l));
        System.out.println("Money in the bank-->" + c1.getAmount());


    }
}

class Bank{

    private long amount;

    public long getAmount() {
        return amount;
    }

    public long setAmount(long amount) {
        this.amount = amount;
        return amount;
    }


    void money(){
        System.out.println("Check money in the bank!!");
    }
}

class Cashier extends Bank{

    void money(){
        super.money();
    }

}
