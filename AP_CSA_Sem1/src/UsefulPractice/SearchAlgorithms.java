package UsefulPractice;
import java.util.Random;
public class SearchAlgorithms {
    static Random r = new Random();
    static int SearchTarget = r.nextInt(1,11);
    static int[] x = {1,2,3,4,5,6,7,8,9,10};
    public static void linsearch(){
        for (int i = 0; i<10; i++){
            if(x[i] == SearchTarget){
                System.out.println("took "+i+" guesses to determine value");
                break;
            }
        }
    }
    
    public static void binsearch(){
        int i = x.length/2;
        int counter = 0;
        while(true){
            System.out.print(x[i]+"|"+SearchTarget);
            counter++;
            if(SearchTarget>x[i]){
                System.out.print(" guess too low, iterating up "+(x.length-i+1)/2+"\n");
                i+=(x.length-i)/2;
            }
            else if(SearchTarget<x[i]){
                System.out.print(" guess too high, iterating down "+(x.length-i-1)/2+"\n");
                i-=(x.length-i)/2;
            }
            else{
                System.out.println(" took "+counter+" guesses to determine value");
                break;
            }
        }
    }

    public static void main(String[] args){
        binsearch();
    }
}
