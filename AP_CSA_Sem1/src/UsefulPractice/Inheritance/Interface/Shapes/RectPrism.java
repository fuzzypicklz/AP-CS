package UsefulPractice.Inheritance.Interface.Shapes;

public class RectPrism implements Shape2{
    private double h;
    private double l;
    private double w;

    public RectPrism(double height, double length, double width){
        h = height;
        l = length;
        w = width;
    }

    public RectPrism(double length, double width){
        l = length;
        w = width;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return l*w;
    }
    @Override
    public double getVolume() {
        // TODO Auto-generated method stub
        return getArea() * h;
    }
}
