package GradedLabs.Transfer;

public class Transfer {
    public static void main(String[] args){
        Account ac1 = new Account("George", 0, 3000);
        Account ac2 = new Account("Jerry", 1, 200);
        double transferAmnt = 200.30;
        ac1.transfer(ac2, transferAmnt);
        System.out.println("transfered $"+transferAmnt+" and charged a fee");
        System.out.println("George bal: $"+ac1.getBalance());
        System.out.println("Jerry bal: $"+ac2.getBalance());
    }
    
}
