package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        Calc c2 = new Calc();
        int c3 = c1.add(3,4);
        double c4 = c2.add(3.414,4.56);

        System.out.println(c3);
        System.out.println(c4);

    }
}

class Calc{

    int add(int a, int b) {
        return a + b;

    }

    double add(double a, double b) {
        return a + b;
    }

}

