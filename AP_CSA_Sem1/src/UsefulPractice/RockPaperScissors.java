package UsefulPractice;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("inpubt rock papre csissors\n> ");
            char playerChoice = s.nextLine().charAt(0);
            char ComputerChoice;
    
            Random rand = new Random();
            int randChoice = rand.nextInt(3);
    
            
    
            switch (randChoice) {
                case 0:
                    ComputerChoice = 'r';
                    break;
                case 1:
                    ComputerChoice = 'p';
                    break;
                case 2:
                    ComputerChoice = 's';
                    break;
            
                default:
                    ComputerChoice = 'g';
                    break;
            }
            if (ComputerChoice == playerChoice) {
                System.out.println("tie");
            }
            else if(playerChoice == 'r'){
                if (ComputerChoice == 'p') {
                    System.out.println("computer chose paper, you lose");
                }
                else{
                    System.out.println("computer chose scissors, you win");
                }
            }
            else if(playerChoice == 'p'){
                if (ComputerChoice == 's'){
                    System.out.println("computer chose scissors, you lose");
                }
                else{
                    System.out.println("computer chose rock, you win");
                }
            }
            else{
                if(ComputerChoice == 'r'){
                    System.out.println("computer chose rock, you lose");
                    
                }
                else{
                    System.out.println("computer chose paper, you win");
                }
            }
            
        }
        
    }
}
