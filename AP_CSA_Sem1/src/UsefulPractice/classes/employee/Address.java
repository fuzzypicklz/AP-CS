package UsefulPractice.classes.employee;
public class Address
{
private String streetAddress, city, state;
private int zipCode;

public Address (String street, String town, String st, int zip)
{
streetAddress = street;
city = town;
state = st;
zipCode = zip;
}

//-----------------------------------------------------------------
public Address ( String town, String st)
{

city = town;
state = st;

}

public Address ( String town)
{
city = town;

}

public Address ( int zip)
{
zipCode = zip;
}

public Address ( String st, int zip)
{

state = st;
zipCode = zip;
}


public String toString()
{
String result;
result = streetAddress + "\n";
result += city + ", " + state + " " + zipCode;

return result;
}
}