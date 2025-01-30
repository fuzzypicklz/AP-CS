package UsefulPractice.recursion.towerHanoi;
//********************************************************************
//  SolveTowers.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates recursion.
//********************************************************************

public class SolveTowers
{
   //-----------------------------------------------------------------
   //  Creates a TowersOfHanoi puzzle and solves it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      TowersOfHanoi towers = new TowersOfHanoi (4);

      towers.solve();
   }
}
