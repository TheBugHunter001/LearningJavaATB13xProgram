package ex_Java_Tasks.Task_090725;

public class TryBlockWithoutException {
    public static void main(String[] args) {
        int a[] = {10,11,12,13};
        try {
            int array = a[3];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e); // No exception thrown as array in bounds
        }
        finally {
            System.out.println("Finally block will always runs.");
        }
    }
}
