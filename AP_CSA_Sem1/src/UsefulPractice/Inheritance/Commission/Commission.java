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
    public double pay(){
        double payment = super.pay() + totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }
    public String toString(){
        return super.toString() + 
        "\npayRate per hour: "+super.getPayRate()+
        "\n Total HoursPaid "+super.pay()+
        "\ntotal sales: "+totalSales +
        "\nCommission: "+commissionRate+
        "\nTotal Commission: "+paycom()+
        "\nTotal Hrs and commission: "+pay();
    }
}
