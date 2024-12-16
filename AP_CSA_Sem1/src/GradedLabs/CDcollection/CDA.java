package GradedLabs.CDcollection;

public class CDA {
    public static void main(String[] args){
        CDCollectionArray seedy = new CDCollectionArray();
        seedy.addCD("Thriller", "Michael Jackson", 9.99, 42);
        seedy.addCD("Back in Black", "AC/DC", 8.99, 41);
        seedy.addCD("The Dark Side of the Moon", "Pink Floyd", 10.99, 43);
        seedy.addCD("The Bodyguard", "Whitney Houston", 7.99, 39);
        seedy.addCD("Rumours", "Fleetwood Mac", 9.49, 45);

        System.out.println(seedy.toString());
    }
}
