package GradedLabs.CDcollection;

public class CDCollectionArray
{
private CD [] collection;
private int count,totalTrack;
private double totalCost;

public CDCollectionArray ()
{
collection = new CD[4];
count = 0;
totalCost = 0.0;
totalTrack=0;
}


public void addCD (String title, String artist, double cost, int tracks)
{
if (count == collection.length)
increaseSize();
collection[count] = new CD (title, artist, cost, tracks);
totalCost += cost;
totalTrack += tracks;
count++;
}
private void increaseSize ()
{
CD[] temp = new CD[collection.length * 2];

for (int cd = 0; cd < collection.length; cd++)
temp[cd] = collection[cd];

collection = temp;
}
public String toString()
{

String result = "******************************************\n";
result += "My CD Collection\n\n";

result += "Number of CDs: " + count + "\n";
result += "Total cost: " + (totalCost) + "\n";
//result += "Average cost: " + (totalCost/count)+ "\n";
result += "Total Tracks: " + totalTrack+ "\n";
// result += "Average Tracks: " + (totalTrack / count )+ "\n";
result += "\n\nCD List:\n\n";

for (int cd = 0; cd < count; cd++)
result += collection[cd].toString() + "\n";

return result;
}

}
// totalCost += cost;
// totalTrack += tracks;
