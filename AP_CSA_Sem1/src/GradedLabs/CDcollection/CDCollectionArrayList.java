package GradedLabs.CDcollection;
import java.util.ArrayList;
public class CDCollectionArrayList
{
private ArrayList<CD> collection;
private int count,totalTrack;
private double totalCost;

public CDCollectionArrayList ()
{
collection = new ArrayList<>();
count = 0;
totalCost = 0.0;
totalTrack=0;
}


public void addCD (String title, String artist, double cost, int tracks)
{
collection.add(new CD (title, artist, cost, tracks));
totalCost += cost;
totalTrack += tracks;
count++;
}

public String toString()
{

String result = "******************************************\n";
result += "My CD Collection\n\n";


// result += "Average Tracks: " + (totalTrack / count )+ "\n";
result += "\n\nCD List:\n\n";

for (int cd = 0; cd < count; cd++)
result += collection.get(cd).toString() + "\n\n";

result += "Number of CDs: " + count + "\n";
result += "Total cost: " + (totalCost) + "\n";
//result += "Average cost: " + (totalCost/count)+ "\n";
result += "Total Tracks: " + totalTrack+ "\n";
return result;
}

}
// totalCost += cost;
// totalTrack += tracks;
