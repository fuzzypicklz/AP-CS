package UsefulPractice.recursion;
public class PascalTriangle {
    public static int Pascal(int row, int col){
        if(col == 1) return 1;
        else if(row == col) return 1;
        else return Pascal(row-1, col) + Pascal(row-1, col-1);
    }
    public static void DisplayPascal(int row){
        for(int i = 1; i<=row; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(Pascal(i, j)+ " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        DisplayPascal(6);
    }
}
