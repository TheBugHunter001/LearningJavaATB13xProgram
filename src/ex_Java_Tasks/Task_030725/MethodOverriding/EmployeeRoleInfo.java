package ex_Java_Tasks.Task_030725.MethodOverriding;

public class EmployeeRoleInfo {
    public static void main(String[] args) {
        Manager Aman = new Manager();
        Aman.role();

        Clerk Mohan = new Clerk();
        Mohan.role();

        Tester Rahul = new Tester();
        Rahul.role();

    }

}

class Employee{

    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{

    @Override
    void role(){
        System.out.println("Manager manages the employees!!");
    }
}

class Clerk extends Employee{

    @Override
    void role(){
        System.out.println("Clerk handles all the files!!");
    }
}


class Tester extends Employee{

    @Override
    void role(){
        System.out.println("Tester tests the software application!!");
    }
}
