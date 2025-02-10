//********************************************************************
//  RecursiveSorts.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the merge sort and quick sort algorithms.
//********************************************************************

public class RecursiveSorts
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using merge sort.
   //-----------------------------------------------------------------
   public static void mergeSort (int[] numbers)
   {
      doMergeSort(numbers, 0, numbers.length - 1);
   }

   //-----------------------------------------------------------------
   //  Recursively sorts the the portion of the given array beginning
   //  at start and ending at end.
   //-----------------------------------------------------------------
   private static void doMergeSort (int[] numbers, int start, int end)
   {
      if (start < end)
      {
         int middle = (start + end) / 2;
         doMergeSort (numbers, start, middle);
         doMergeSort (numbers, middle + 1, end);
         merge (numbers, start, middle, end);
      }
   }

   //-----------------------------------------------------------------
   //  Merges in sorted order the two sorted subarrays
   //  [start, middle] and [middle + 1, end].
   //-----------------------------------------------------------------
   private static void merge (int[] numbers, int start, int middle,
                     int end)
   {
      // This temporary array will be used to build the merged list.
      int[] tmp = new int[end - start + 1];

      int index1 = start;
      int index2 = middle + 1;
      int indexTmp = 0;

      // Loop until one of the sublists is exhausted, adding the smaller
      // of the first elements of each sublist to the merged list.
      while (index1 <= middle && index2 <= end)
      {
         if (numbers[index1] < numbers[index2])
         {
             tmp[indexTmp] = numbers[index1];
             index1++;
         }
         else
         {
             tmp[indexTmp] = numbers[index2];
             index2++;
         }
          indexTmp++;
      }

      // Add to the merged list the remaining elements of whichever sublist
      // is not yet exhausted.
      while (index1 <= middle)
      {
         tmp[indexTmp] = numbers[index1];
         index1++;
         indexTmp++;
      }
      while (index2 <= end)
      {
         tmp[indexTmp] = numbers[index2];
         index2++;
         indexTmp++;
      }

      // Copy the merged list from tmp into numbers.
      for (indexTmp = 0; indexTmp < tmp.length; indexTmp++)
      {
         numbers[start + indexTmp] = tmp[indexTmp];
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using quick sort.
   //-----------------------------------------------------------------
   public static void quickSort (int[] numbers)
   {
      doQuickSort(numbers, 0, numbers.length - 1);
   }
   //-----------------------------------------------------------------
   //  Recursively sorts the portion of the given array beginning
   //  at start and ending at end.
   //-----------------------------------------------------------------
   private static void doQuickSort (int[] numbers, int start, int end)
   {
      if (start < end)
      {
         int middle = partition(numbers, start, end);
         doQuickSort(numbers, start, middle);
         doQuickSort(numbers, middle + 1, end);
      }
   }

   //-----------------------------------------------------------------
   //  Partitions the array such that each value in [start, middle]
   //  is less than or equal to each value in [middle + 1, end].
   //  The index middle is determined in the procedure and returned.
   //-----------------------------------------------------------------
   private static int partition (int[] numbers, int start, int end)
   {
      int pivot = numbers[start];
      int i = start - 1;
      int j = end + 1;

      // As the loop progresses, the indices i and j move towards each other.
      // Elements at i and j that are on the wrong side of the partition are
      // exchanged. When i and j pass each other, the loop ends and j is
      // returned as the index at which the elements are partitioned around.
      while (true)
      {
         i = i + 1;
         while (numbers[i] < pivot)
            i = i + 1;

         j = j - 1;
         while (numbers[j] > pivot)
            j = j - 1;

         if (i < j)
         {
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
         }
         else return j;
      }
   }
}
