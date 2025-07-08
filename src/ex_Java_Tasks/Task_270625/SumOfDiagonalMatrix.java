package ex_Java_Tasks.Task_270625;

public class SumOfDiagonalMatrix {
    public static void main(String[] args) {
        int sum=0;
        int [][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println("Original Matrix below:-");

        for (int i=0; i< matrix.length;i++){
            for (int j=0; j< matrix.length;j++){
                System.out.print(matrix[i][j]+ "|");
            }
            System.out.println();
        }

        System.out.println("Sum of Diagonal Matrix below:-");

        for (int i=0; i<matrix.length;i++){
            for (int j=0; j< matrix.length;j++){
                if(i==j){
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.println(sum);

    }
}
