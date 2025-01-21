package UsefulPractice.Inheritance.Interface.Shapes;

public class TriPrism implements Shape2{
    double h;
    double a;
    double b;

    public TriPrism(double height, double altitude, double base){
        h = height;
        a = altitude;
        b = base;
    }

    public TriPrism(double altitude, double base){
        a = altitude;
        b = base;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return a*b*1/2;
    }
    @Override
    public double getVolume() {
        // TODO Auto-generated method stub
        return getArea() * h;
    }
}
