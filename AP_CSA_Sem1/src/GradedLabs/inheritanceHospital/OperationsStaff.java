package GradedLabs.inheritanceHospital;

public class OperationsStaff extends Employee{
    String SECTOR;
    public OperationsStaff(String name, int id, double salary, String sector){
        super(name, id, salary);
        SECTOR=sector;
    }
    public String toString(){
        return  super.toString()+
                "\nSECTOR: "+SECTOR;
    }
}
