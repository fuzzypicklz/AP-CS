package GradedLabs.inheritanceHospital;

public class MedicalStaff extends Employee{
    private String FIELD;
    private String EDU;
    public MedicalStaff(String name, int id, double salary, String sector, String edu){
        super(name, id, salary);
        FIELD = sector;
        EDU=edu;
    }

    public String toString(){
        return  super.toString()+
                "\nSECTOR: "+FIELD+
                "\nEDUCATION: "+EDU;
    }
}
