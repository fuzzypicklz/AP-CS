package GradedLabs.inheritanceHospital;

public class Janitor extends OperationsStaff {
    private int TC;
    public Janitor(String name, int id, double salary, String sector, int toiletsCleaned){
        super(name, id, salary, sector);
        TC = toiletsCleaned;
    }
    public String toString(){
        return  super.toString()+
                "\nToilets Cleaned: "+TC;
    }
}
