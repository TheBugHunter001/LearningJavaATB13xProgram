package ex_Java_Tasks.Task_090725;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleCheckedExceptionUsingTryCatch {
    public static void main(String[] args) {



        try {
            FileReader fileReader = new FileReader("C://test.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
