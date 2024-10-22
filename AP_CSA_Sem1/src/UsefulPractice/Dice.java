package UsefulPractice;
import java.util.Random;
public class Dice {
    static int Sides;
    static int SideUp;
    static Random r = new Random();
    public Dice(int s){
        Sides = s;
    }
    public int Roll(){
        return r.nextInt(Sides)+1;
    }
    public int[] Roll(int rolls){
        int [] rollList = new int[rolls];
        for(int i=0; i<rollList.length; i++){
            rollList[i] = r.nextInt(Sides)+1;
        }
        return rollList;
    }
}
