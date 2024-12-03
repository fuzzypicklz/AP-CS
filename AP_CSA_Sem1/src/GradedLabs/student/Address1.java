package GradedLabs.student;

public class Address1 {
    private String streetAddress, city, state;
    private int zipCode;

    public Address1(String street, String town, String st, int zip) {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    public String toString() {
        String result;

        result = streetAddress + " ";
        result += city + ", " + state + " " + zipCode;

        return result;
    }
}