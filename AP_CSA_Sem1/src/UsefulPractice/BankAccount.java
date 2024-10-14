package UsefulPractice;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccount {
    static double balance = 0.00;
    static int ID;
    static String password;
    public BankAccount(){
        Scanner s = new Scanner(System.in);
        System.out.print("BankOS v0.1> Input accnt Password\nBankOS v0.1> ");
        password = s.nextLine();
    }
    public static void Deposit(Double x){
        balance += x;
        System.out.println("BankOS v0.1> Deposited $"+x);
        Fee();
    }
    
    public static void Withdraw(Double x){
        if (x>balance) {
            System.out.println("BankOS v0.1> Insufficient funds (balance is $"+balance+")");
        }
        else{
            balance -= x;
            System.out.println("BankOS v0.1> Withdrew $"+x);
            Fee();
        }
    }
    public static void Transfer(Double x, BankAccount target){
        target.balance+=x;
        Fee();
        balance-=x;

        System.out.println("BankOS v0.1> Transfer successful");
        System.out.println("BankOS v0.1> Target account balance: "+target.balance);
        getBalance();
    }

    public static void Interest(int years, double rate, double period){

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        double netInterest = balance * Math.pow((1+rate / period), period * years);
        netInterest = Double.parseDouble(df.format(netInterest));
        System.out.println("BankOS v0.1> you have accumulated $"+(netInterest-balance)+" in interest");
        balance = netInterest;
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
        System.out.println("interest/int <years> <rate> <period>\tcollect interest over <years> years at <rate> rate compounded <period> times annually");
        System.out.println("transfer <value> <Target ID> \t\ttransfer $<value> to account <Target ID>");
    }
    public static void getBalance(){
        System.out.println("BankOS v0.1> Your balance: $"+balance);
    }
}
