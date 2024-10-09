package UsefulPractice;
import java.util.Scanner;   

public class BankExec {
    public static void main(String[] args){
        Bank b = new Bank();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("BankOS v0.1> ");
            String[] input = s.nextLine().split(" ");
            switch(input[0].toLowerCase()){
                default:
                    System.err.println("BankOS v0.1> Invalid function.");
                    break;
                case "withdraw":
                case"with":{
                    if(input.length>1){
                        while (true){
                            try {
                                double amount = Double.parseDouble(input[1]);
                                b.Withdraw(amount);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("BankOS v0.1> Invalid amount. Please enter a valid number.");
                            }
                        }
                    }
                    else{
                        System.out.println("BankOS v0.1> Missing Arguments");
                        break;
                    }
                }
                case "deposit":
                case "dep":{
                    if(input.length>1){
                        while (true){
                            try {
                                double amount = Double.parseDouble(input[1]);
                                b.Deposit(amount);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("BankOS v0.1> Invalid amount. Please enter a valid number.");
                            }
                        }
                    }
                    else{
                        System.out.println("BankOS v0.1> Missing Arguments");
                        break;
                    }
                }
                case "interest":
                case "int":{
                    if(input.length>2){
                        try {
                            int year = Integer.parseInt(input[1]);
                            double rate = Double.parseDouble(input[2]);
                            double period = Double.parseDouble(input[3]);
                            b.Interest(year, rate, period);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("BankOS v0.1> Invalid amount. Please enter a valid number.");
                        }   
                    }
                    else{
                        System.out.println("BankOS v0.1> Missing Arguments");
                        break;
                    }
                }
                case "balance":
                case "bal":{
                    b.getBalance();
                    break;
                }
                case "help":{
                    b.Catalogue();
                    break;
                }
                
                
            }
        }
    }
}
