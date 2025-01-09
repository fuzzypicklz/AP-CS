package GradedLabs.inheritanceHospital;

public class Surgeon extends MedicalStaff{
    private String FOCUS;
    public Surgeon(String name, int id, double salary, String sector, String edu, String focus){
        super(name, id, salary, sector, edu);
        FOCUS = focus;
    }
    public String toString(){
        return  super.toString()+
                "\nFOCUS: "+FOCUS;
    }
}
