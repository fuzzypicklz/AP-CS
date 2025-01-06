package UsefulPractice.integers;

import java.util.Random;
import java.util.Scanner;

public class HigherOrLower {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int guess = 0, counter = 0;
        int RandomInt = rand.nextInt(1,11);
        
        System.out.print("I am thinking of a number between 1 and 10. What is the number?\n> ");
        while (true) {
            counter++;
            guess = s.nextInt();
            if (RandomInt == guess) {
                break;
            }
            else if(guess> RandomInt){
                System.out.print("Too high, guess again\n> ");
            }
            else if(guess< RandomInt){
                System.out.print("Too low, guess again\n> ");
            }
        }
        System.out.print("You guessed the number correctly in "+counter+" tries");
    }
}

