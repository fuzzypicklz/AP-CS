package UsefulPractice.Inheritance.polymorphism.Planes;

public class Plane {
    private double SPAN;
    private String MD;
    private int SPEED;

    public Plane(double wingspan, String manufactured, int speed){
        SPAN = wingspan;
        MD = manufactured;
        SPEED = speed;
    }
    public double getWingspan(){
        return SPAN;
    }
    public String getMD(){
        return MD;
    }
    public int getSpeed(){
        return SPEED;
    }

    public String toString(){
        return  "\nSPAN "+SPAN+
                "\nMANUFACTURED "+MD+
                "\nTOP SPEED "+SPEED;
    }
}
