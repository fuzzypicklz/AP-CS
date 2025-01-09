package UsefulPractice.Inheritance.Animals;

public class Sheep extends Animal {

    private int Size;
    private String color;

    public Sheep(boolean veg, String food, int legs, int Size) {
        super(veg, food, legs);
        this.Size = 10;
    }

    public Sheep(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result = super.toString();
        return result;
    }

}
