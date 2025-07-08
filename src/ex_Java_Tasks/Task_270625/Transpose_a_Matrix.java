package ex_Java_Tasks.Task_270625;

public class Transpose_a_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}};

        System.out.println("Original Matrix below:-");

        for (int i=0; i<4;i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("Tranpose Matrix below:-");

        //Create Transpose matrix
        for (int i=0; i<3;i++){
            for (int j=0; j<4; j++){
                System.out.print(matrix[j][i]+"|");
            }
            System.out.println();
        }

    }
}
