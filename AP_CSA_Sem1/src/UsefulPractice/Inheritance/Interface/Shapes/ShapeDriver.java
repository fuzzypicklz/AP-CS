package UsefulPractice.Inheritance.Interface.Shapes;

public class ShapeDriver {
    public static void main(String[] args) {
        RectPrism r1 = new RectPrism(5, 10);
        RectPrism r2 = new RectPrism(5, 10, 15);

        TriPrism t1 = new TriPrism(3, 5);
        TriPrism t2 = new TriPrism(3, 5, 10);

        Cylinder c1 = new Cylinder(5);
        Cylinder c2 = new Cylinder(5, 10);

        // RectPrism methods
        System.out.println("RectPrism r1 Area: " + r1.getArea());
        System.out.println();

        System.out.println("RectPrism r2 Area: " + r2.getArea());
        System.out.println("RectPrism r2 Volume: " + r2.getVolume());
        System.out.println();

        // TriPrism methods
        System.out.println("TriPrism t1 Area: " + t1.getArea());
        System.out.println();

        System.out.println("TriPrism t2 Area: " + t2.getArea());
        System.out.println("TriPrism t2 Volume: " + t2.getVolume());
        System.out.println();

        // Cylinder methods
        System.out.println("Cylinder c1 Area: " + c1.getArea());
        System.out.println();

        System.out.println("Cylinder c2 Area: " + c2.getArea());
        System.out.println("Cylinder c2 Volume: " + c2.getVolume());
        System.out.println();
    }
}
