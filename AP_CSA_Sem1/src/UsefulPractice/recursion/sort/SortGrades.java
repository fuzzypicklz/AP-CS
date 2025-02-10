//********************************************************************
//  SortGrades.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing a numeric merge sort.
//********************************************************************

public class SortGrades
{
   //-----------------------------------------------------------------
   //  Creates an array of grades, sorts them, then prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};

      RecursiveSorts.mergeSort (grades);

      for (int index = 0; index < grades.length; index++)
         System.out.print (grades[index] + "   ");
   }
}
