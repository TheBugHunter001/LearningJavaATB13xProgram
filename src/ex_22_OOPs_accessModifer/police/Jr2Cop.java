package ex_22_OOPs_accessModifer.police;

public class Jr2Cop {
    public static void main(String[] args) {
        Cop jrCop2 = new Cop(3);
        jrCop2.canIShoot();
        jrCop2.thisDefaultF1();
        System.out.println(jrCop2.gun);
    }
}
