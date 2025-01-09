package UsefulPractice.Inheritance.Animals;

public class Animal {

    private static boolean vegetarian = false;
    private static String eats;
    private static int noOfLegs;

    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public static boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public static String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public static int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String toString() {
        String result = "";
        result += vegetarian;
        result += eats;
        result += noOfLegs;
        return result;
    }

}
