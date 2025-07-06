package ex_Java_Tasks_04th_Jul;

public class Program3 {
    public static void main(String[] args) {
    Delhi delhites = new Delhi();
    delhites.inhabitants();
    }
}


class India{
    long people = 12000000000l;

    void city(){
        System.out.println("Delhi is in India");
    }
}

class Delhi extends India{

    void city(){
        super.city();
    }

    void inhabitants(){
        System.out.println("People in Delhi-->" + super.people);
    }
}
