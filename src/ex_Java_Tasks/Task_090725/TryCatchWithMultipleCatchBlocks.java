package ex_Java_Tasks.Task_090725;

public class TryCatchWithMultipleCatchBlocks {
    public static void main(String[] args) {
        int a[] = {10,11,12,13};
        try {
            int array = a[4];
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
