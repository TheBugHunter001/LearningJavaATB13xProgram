package ex_Java_Tasks_03rd_Jul.MethodOverloading;

public class FindMaximum {
    public static void main(String[] args) {
        Utility u1 = new Utility();
        System.out.println(u1.max(3,8));
        System.out.println(u1.max(5,2,9));
        System.out.println(u1.max(98.65,72.34));
    }
}

class Utility{

    int max(int a,int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    int max(int a,int b,int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    double max(double a,double b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
}