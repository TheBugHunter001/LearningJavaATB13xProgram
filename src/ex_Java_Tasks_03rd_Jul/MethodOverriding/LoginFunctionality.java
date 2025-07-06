package ex_Java_Tasks_03rd_Jul.MethodOverriding;

public class LoginFunctionality {
    public static void main(String[] args) {
        User u1 = new AdminUser();
        User u2 = new RegularUser();

        u1.login();
        u2.login();

    }
}

class User{

    void login(){
        System.out.println("User login!!");
    }
}

class AdminUser extends User{

    @Override
    void login() {
        System.out.println("Admin user login!!");
    }
}

class RegularUser extends User{

    @Override
    void login(){
        System.out.println("Regular user login!!");
    }
}

