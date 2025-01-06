package UsefulPractice.integers;

public class PascalTriangle {
    public static void main(String[] args){
        int[][] numbers = new int[10][10];
        for(int i = 0; i < numbers.length; i ++){
            numbers[i][0] = 1;
            numbers[i][i] = 1;
        }
        
        
        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length-1; j++){
                if(numbers[i][j+1]!=1){
                    numbers[i][j+1] = numbers[i-1][j]+numbers[i-1][j+1];
                }
            }
        }
        
        for (int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
