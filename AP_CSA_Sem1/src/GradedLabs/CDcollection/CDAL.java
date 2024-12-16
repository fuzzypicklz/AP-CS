package GradedLabs.CDcollection;
import java.util.ArrayList;
public class CDAL {
    public static void main(String[] args){
        /*
        CDCollectionArrayList seedy = new CDCollectionArrayList();
        seedy.addCD("Thriller", "Michael Jackson", 9.99, 42);
        seedy.addCD("Back in Black", "AC/DC", 8.99, 41);
        seedy.addCD("The Dark Side of the Moon", "Pink Floyd", 10.99, 43);
        seedy.addCD("The Bodyguard", "Whitney Houston", 7.99, 39);
        seedy.addCD("Rumours", "Fleetwood Mac", 9.49, 45);

        System.out.println(seedy.toString());
        */
        
        ArrayList<CD> seedy = new ArrayList<>();

        seedy.add(new CD("Thriller", "Michael Jackson", 9.99, 42));
        seedy.add(new CD("Back in Black", "AC/DC", 8.99, 41));
        seedy.add(new CD("The Dark Side of the Moon", "Pink Floyd", 10.99, 43));
        seedy.add(new CD("The Bodyguard", "Whitney Houston", 7.99, 39));
        seedy.add(new CD("Rumours", "Fleetwood Mac", 9.49, 45));

        double cost = 0.0;
        int tracks = 0;
        for (int i = 0; i < seedy.size(); i++){
            System.out.println(seedy.get(i).toString());
            cost += seedy.get(i).getCost();
            tracks += seedy.get(i).getTracks();
        }
        System.out.println("Number of CDs: " + seedy.size());
        System.out.println("Total Cost: " + cost);
        System.out.println("Total tracks: " + tracks);
        

    }
}
