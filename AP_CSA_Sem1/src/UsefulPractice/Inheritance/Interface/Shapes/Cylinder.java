package UsefulPractice.Inheritance.Interface.Shapes;

public class Cylinder implements Shape2 {
    private double r;
    private double h;
    
    public Cylinder(double radius, double height){
        r = radius;
        h = height;
    }

    public Cylinder(double radius){
        r = radius;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI*r*r;
    }
    @Override
    public double getVolume() {
        // TODO Auto-generated method stub
        return getArea()*h;
    }
}
