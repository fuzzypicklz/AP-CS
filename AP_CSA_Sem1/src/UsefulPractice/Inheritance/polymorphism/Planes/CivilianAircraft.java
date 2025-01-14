package UsefulPractice.Inheritance.polymorphism.Planes;

public class CivilianAircraft extends Plane {
    private String AIRLINE;
    private int SEATS;
    public CivilianAircraft(double wingspan, String manufactured, int speed, String airline, int Passengers ){
        super(wingspan, manufactured, speed);
        AIRLINE = airline;
        SEATS = Passengers;
    }
    public String getAirline(){
        return AIRLINE;
    }
    public int getPassengers(){
        return SEATS;
    }
    public String toString(){
        return  super.toString()+
                "\nAIRLINE "+AIRLINE+
                "\nPASSENGERS "+SEATS;
    }
}

