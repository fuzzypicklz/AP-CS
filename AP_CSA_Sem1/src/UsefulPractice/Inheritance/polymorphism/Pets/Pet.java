package UsefulPractice.Inheritance.polymorphism.Pets;

public abstract class Pet
{
private String name;

// //-----------------------------------------------------------------
// // Creates a pet with the given name.
// //-----------------------------------------------------------------
public Pet(String petName)
{
name = petName;
}

//-----------------------------------------------------------------
// Returns this pet's name.
//-----------------------------------------------------------------
public String getName()
{
return name;
}

//-----------------------------------------------------------------
// Returns a string representation of this pet.
//-----------------------------------------------------------------
public String toString()
{
return "pet " + name;
}


abstract public String speak();

abstract public String move();





}
