package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multi_LEVEL {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        System.out.println("------------------");

        Father f = new Father();
        f.f();
        f.gf();
        f.home();

        System.out.println("------------------");

        Son s = new Son();
        s.s();
        s.gf();
        s.f();
        s.home();
    }
}
