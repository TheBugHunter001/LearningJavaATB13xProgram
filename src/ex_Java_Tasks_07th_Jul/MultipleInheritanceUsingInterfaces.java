package ex_Java_Tasks_07th_Jul;

public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
    Document testDoc = new Document();
    testDoc.show();
    testDoc.print();

    }
}


interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Document implements Printable, Showable{


    @Override
    public void print() {
        System.out.println("The document is printed!!");
    }

    @Override
    public void show() {
        System.out.println("The document is shown!!");
    }
}

