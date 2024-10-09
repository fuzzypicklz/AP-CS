package UsefulPractice;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    static double balance = 1000.00;
    
    public static void Deposit(Double x){
        balance += x;
        System.out.println("BankOS v0.1> Deposited $"+x);
        Fee();
    }
    
    public static void Withdraw(Double x){
        if (x>balance) {
            
        }
        else{
            System.out.println("BankOS v0.1> Insufficient funds");
        }
        balance -= x;
        System.out.println("BankOS v0.1> Withdrew $"+x);
        Fee();
    }

    public static void Interest(int years, double rate, double period){

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        double grossInterest = balance * Math.pow((1 + rate / period), period * years);
        grossInterest = Double.parseDouble(df.format(grossInterest));
        System.out.println("BankOS v0.1> you have accumulated $"+grossInterest+" in interest");
        balance += grossInterest;
        getBalance();

    }

    public static void Fee(){
        double temp = balance;
        if(balance >= 30){
            balance -= 0.25;
        }
        if(balance >= 100){
            balance -= 0.25;
        }
        if(balance >= 1000){
            balance -= 0.25;
        }

        System.out.println("BankOS v0.1> You have been charged $"+(temp-balance));
    }
    public static void Catalogue(){
        System.out.println("\t------ <BankOS v0.1> ------");
        System.out.println("CMD/ALIAS <Argument>\t\t\tFunction");
        System.out.println("withdraw/with <value>\t\t\tWithdraw from account");
        System.out.println("depost/dep <value>\t\t\tDeposit to account");
        System.out.println("balance/bal\t\t\t\tView Balance");
        System.out.println("interest/int <years> <rate> <period>\tcollect interest over <years> years at <rate> rate compounded every <period> years");
    }
    public static void getBalance(){
        System.out.println("BankOS v0.1> Your balance: $"+balance);
    }
}
