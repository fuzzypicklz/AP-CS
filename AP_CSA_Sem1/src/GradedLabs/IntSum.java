package GradedLabs;

public class IntSum {
    public static int[] SumInt(int[] input){
        int result = 0;
        int average = 0;
        
        for (int i = 0; i < input.length; i++){
            result += input[i];
            System.out.print(input[i]);
        }
        System.out.print("\n");
        for (int i = input.length-1; i > 0 ; i--){
            System.out.print(input[i]);
        }   
        System.out.print("\n");
        average = result/input.length;

        int[] returning = {result,average};
        return returning;
    }

    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        int[] intSunms = SumInt(input);

        System.out.println("Average "+intSunms[1]);
        System.out.println("Sum "+intSunms[0]);
        
    }
}
