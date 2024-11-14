package GradedLabs;

public class MatrixMinMax {
    public static void main(String[] args){
        // Example usage
        /* 
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
        */

        int[][] mayik = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };

        System.out.println(IsMagicSquare(mayik));
    }

    public static int[] rowsum(int[][] matrix){
        int[] sums = new int[matrix.length];
        for(int i = 0; i<matrix.length;i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum+= matrix[i][j];
            }
            sums[i] = sum;
            int temp = i+1;
            System.out.println("Sum of row " + temp + " is " + sum);
        }
        return sums;
    }
    public static int[] collsum(int[][] matrix){
        int[] sums = new int[matrix[0].length];
        for(int j = 0; j < matrix[0].length; j++){
            int sum = 0;
            for(int i = 0; i < matrix.length; i++){
                sum += matrix[i][j];
            }
            sums[j] = sum;
            int temp = j+1;
            System.out.println("Sum of column " + temp + " is " + sum);
        }
        return sums;
    }

    public static int[][] rowMinMax(int[][] matrix){
        int[] maxs = new int[matrix.length];
        int[] mins = new int[matrix.length];
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
            maxs[i] = max;
            mins[i] = min;

            
            //int temp = i+1;
            //System.out.println("Max at row " + temp + " is " + max);
            //System.out.println("Min at row " + temp + " is " + min);
        }
        int[][] result = {maxs, mins};
        return result;
    }

    public static int[][] collMinMax(int[][] matrix) {
        int[] maxs = new int[matrix[0].length];
        int[] mins = new int[matrix[0].length];
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
            maxs[j] = max;
            mins[j] = min;
            //int temp = j+1;
            //System.out.println("Max at column " + temp + " is " + max);
            //System.out.println("Min at column " + temp + " is " + min);
            
        }
        int[][] result = {maxs, mins};
        return result;
    }
    public static int[] DiagSum(int[][] square){
        int[] sums = new int[square.length];
        for(int i = 0; i<square.length; i++){
            sums[0]+=square[i][i];
        }
        System.out.println("sum of top left to bottom right: "+sums[0]);
        for(int i = 0; i<square.length; i++){
            sums[1]+=square[i][square.length-i-1];
        }
        System.out.println("sum of top right to bottom left: "+sums[1]);

        return sums;

    }
    public static Boolean IsMagicSquare(int[][] square){
        if (square.length == square[0].length) {
            int[] csum = collsum(square);
            int[] rsum = rowsum(square);
            int[] dsum = DiagSum(square);
            int start = csum[0];

            if (start != dsum[0] || start != dsum[0]) {
                return false;
            }
            for(int i = 0; i < square.length; i++){
                if(start == csum[i] && start == rsum [i]) continue;
                else return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
}
