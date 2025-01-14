package UsefulPractice.Inheritance.Commission;

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    
    public Commission(String eName,String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);

        commissionRate = comRate;
    }
    public void addSales(double sales){
        totalSales += sales;
    }
    public double paycom(){
        return totalSales * commissionRate;
    }
}
