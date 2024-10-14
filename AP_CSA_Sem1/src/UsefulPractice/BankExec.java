package UsefulPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class BankExec {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<BankAccount> acnt = new ArrayList<>();
        acnt.add(new BankAccount());
        BankAccount b = acnt.get(0);
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
                        try {
                            double amount = Double.parseDouble(input[1]);
                            b.Withdraw(amount);
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
                case "deposit":
                case "dep":{
                    if(input.length>1){
                        try {
                            double amount = Double.parseDouble(input[1]);
                            b.Deposit(amount);
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
                case "newaccount":
                case "na":{
                    BankAccount temp = new BankAccount();
                    acnt.add(temp);
                    b = temp;
                    break;
                }
                case "viewaccounts":
                case"va":{
                    System.out.println("BankOs v0.1> Existing Accounts:");

                    for (int i = 0; i<acnt.size();i++){
                        System.out.println(i+"|"+acnt.get(i).password);
                    }
                    break;
                }
                case "chooseaccount":
                case "ca":{
                    if (input.length>2) {
                        if(Integer.parseInt(input[1])<acnt.size()){
                            if(acnt.get(Integer.parseInt(input[1])).password == input[2]){
                                System.out.println(acnt.get(Integer.parseInt(input[1])).password);
                                b = acnt.get(Integer.parseInt(input[1]));
                            System.out.println("BankOS v0.1> Account "+input[1]+" selected");
                            }
                            System.out.println("fsljlkasdjlkdflfs");
                            break;
                        }
                    }
                    System.out.print("BankOs v0.1> Please input valid account ID and the password to that account");
                    break;
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
