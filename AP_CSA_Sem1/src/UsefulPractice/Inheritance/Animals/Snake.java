package UsefulPractice.Inheritance.Animals;

public class Snake extends Animal
{

private static String color,move;

public Snake(boolean veg, String food, int lengths, String move) {
super(veg, food, lengths);
this.color="Gray";
this.move=move;
}

public static String getColor() {
return color;
}

// public static void setColor(String color) {
// this.color = color;
// }
// public static String toString()
// {
// String result = super.toString();
// return result;
// }

}
