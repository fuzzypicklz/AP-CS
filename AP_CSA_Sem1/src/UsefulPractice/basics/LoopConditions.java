package UsefulPractice.basics;
import java.util.Random;


public class LoopConditions {
    public static void main(String[] args){
        Random rand = new Random();
        int MyDice1,MyDice2, SumSnkEye = 0, SumBoxCar = 0, sumDoubles = 0, lim = 100000;

        for(int i = 0; i<=lim;i++){
            MyDice1 = rand.nextInt(1,7);
            MyDice2 = rand.nextInt(1,7);
            System.out.println(MyDice1 + " " + MyDice2);
            if (MyDice1 == MyDice2 && MyDice1+MyDice2 == 12) {
                SumBoxCar++;
            }if (MyDice1 == MyDice2 && MyDice1+MyDice2 == 2) {
                SumSnkEye++;
            }
            if (MyDice1==MyDice2){
                sumDoubles++;
            }
        }
        System.out.println("Box cars: "+SumBoxCar);
        System.out.println("Percentage Box Cars: "+ ((double) SumBoxCar / lim) * 100+"%");

        System.out.println("Snake eyes: "+SumSnkEye);
        System.out.println("Percentage Snake eyes: "+ ((double) SumSnkEye / lim) * 100+"%");

        System.out.println("Total doubles: "+sumDoubles);
        System.out.println("Percentage doubles "+ ((double) sumDoubles / lim) * 100+"%");
    }
}
