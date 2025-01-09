package UsefulPractice.Inheritance.Animals;

public class AnimalInhTest {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");
        Snake SNK = new Snake(false, "Water", 4, "20");
        Sheep MyMaa = new Sheep(true, "Vegie", 4, 100);
        
        System.out.println(MyMaa);
        System.out.println(SNK);
        
        System.out.println("Cat is Vegetarian? " + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        
        System.out.println("Snake is Vegetarian? " + Snake.isVegetarian());
        System.out.println("Snake eats " + Snake.getEats());
        System.out.println("Snake has " + Snake.getNoOfLegs() + " legs.");
        System.out.println("Snake color is " + Snake.getColor());
    }

}
