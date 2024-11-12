package GradedLabs;

public class MatrixMinMax {
    public static void main(String[] args){
        // Example usage
        int[][] matrix = {
            {20,15,6,19,18},
            {4,46,24,17,18},
            {12,50,23,16,31}
        };
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        rowsum(matrix);
        System.out.println();
        collsum(matrix);
        System.out.println();
        rowMinMax(matrix);
        System.out.println();
        collMinMax(matrix);
    }

    public static void rowsum(int[][] matrix){
        for(int i = 0; i<matrix.length;i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum+= matrix[i][j];
            }
            int temp = i+1;
            System.out.println("Sum of row " + temp + " is " + sum);
        }
    }
    public static void collsum(int[][] matrix){
        for(int j = 0; j < matrix[0].length; j++){
            int sum = 0;
            for(int i = 0; i < matrix.length; i++){
                sum += matrix[i][j];
            }
            int temp = j+1;
            System.out.println("Sum of column " + temp + " is " + sum);
        }
    }

    public static void rowMinMax(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            int max = matrix[i][0];
            int min = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            int temp = i+1;
            System.out.println("Max at row " + temp + " is " + max);
            System.out.println("Min at row " + temp + " is " + min);
        }
    }

    public static void collMinMax(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            int min = matrix[0][j];
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            int temp = j+1;
            System.out.println("Max at column " + temp + " is " + max);
            System.out.println("Min at column " + temp + " is " + min);
        }
    }
}
