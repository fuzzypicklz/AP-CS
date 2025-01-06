package UsefulPractice.basics;

public class LoopConditionals {
    public static void main(String[] args){
        int count = 0, sum=0;
        while (count<=100){
            if( count % 2 == 0){
                System.out.println(count);
                sum += count;
            }
            count+=5;
        }
    }
}
