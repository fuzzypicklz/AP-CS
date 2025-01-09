package GradedLabs.inheritanceHospital;

public class Employee {
    private String NAME;
    private int ID;
    private double PAY;
    
    public Employee(String name, int id, double salary){
        NAME = name;
        ID=id;
        PAY=salary;
    }
    public String toString(){
        return  "NAME: "+NAME+
                "\nID: "+ID+
                "\nYEARLY SALARY: "+PAY;
    }
}
