package GradedLabs.CDcollection;

public class CD
{
private String title, artist;
public double cost;
private int tracks;

public CD (String name, String singer, double price, int numTracks)
{
title = name;
artist = singer;
cost = price;
tracks = numTracks;
}
public double getCost()
{
return cost;
}
public double SetCost(double Newprice)
{
return cost;
}
public int getTracks()
{
return tracks;
}
public String toString()
{
String result;
result = cost + "\t" + tracks + "\t";
result += title + "\t" + artist;
return result;
}
}
