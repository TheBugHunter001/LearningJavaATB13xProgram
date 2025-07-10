package ex_Java_Tasks.Task_090725;

public class CatchSpecificVsGenericException {
    public static void main(String[] args) {
        String text = null;

        // Part 1: Using catch(Exception e)
        try {
            text.trim();
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }

        // Part 2: Using catch(NullPointerException e)
        try {
            text.trim();
        }
        catch (NullPointerException e){
            System.out.println(e);

        }
    }
}
