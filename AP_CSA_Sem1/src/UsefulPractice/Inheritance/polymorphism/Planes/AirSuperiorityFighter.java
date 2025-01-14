package UsefulPractice.Inheritance.polymorphism.Planes;

import java.security.PrivateKey;

public class AirSuperiorityFighter extends Plane {
    private String WEAPONS;
    private double OVERLOAD;
    public AirSuperiorityFighter(double wingspan, String manufactured, int speed, String armnament, double gOverload){
        super(wingspan, manufactured, speed);
        OVERLOAD = gOverload;
        WEAPONS = armnament;
    }
    public double getOverload(){
        return OVERLOAD;
    }
    public String getWeapons(){
        return WEAPONS;
    }
    public String toString(){
        return  super.toString()+
                "\nG-OVERLOAD "+OVERLOAD+
                "\nWEAPON SYSTEMS "+WEAPONS;
    }
}
