package ex_Java_Tasks.Task_020725;

public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();
    }

}

class User{

    void login(){
        System.out.println("User will be able to login!!");
    }
}

class AdminUser extends User {

    void accessAdminPanel(){
        System.out.println("Admin user will be able to access Admin Panel!!");
    }

}

class SuperAdmin extends AdminUser{

    void shutdownSystem(){

        System.out.println("Super user can shut down the system!!");
    }
}