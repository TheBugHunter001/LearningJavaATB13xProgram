package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers={6,9,7,3,23,87,1};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
