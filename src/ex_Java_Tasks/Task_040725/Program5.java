package ex_Java_Tasks.Task_040725;

public class Program5 {
    public static void main(String[] args) {
    Student s1 = new TestDefault();
    s1.showDetails();

    }
}

class Student{

    void showDetails(){
        System.out.println("Display details of the student");
    }
}

class TestDefault extends Student{

    void showDetails(){
        super.showDetails();
        System.out.println("Display test details");
    }
}
