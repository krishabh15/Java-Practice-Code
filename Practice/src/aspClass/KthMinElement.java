package aspClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KthMinElement {
	class MinHeap{
		int[] harr;
		int capacity;
		int heap_size;
		
		int parent(int i) { return (i - 1) / 2; }
	    int left(int i) { return ((2 * i )+ 1); }
	    int right(int i) { return ((2 * i) + 2); }
	    
	    int getMin() { return harr[0]; } // Returns minimum
	    
	    void replaceMax(int x)
	    {
	      this.harr[0] = x;
	      minHeapify(0);
	    }
	    
	    MinHeap(int a[], int size)
	    {
	      heap_size = size;
	      harr = a; // store address of array
	      int i = (heap_size - 1) / 2;
	      while (i >= 0)
	      {
	        minHeapify(i);
	        i--;
	      }
	    }
	    
	    int extractMin()
	    {
	      if (heap_size == 0)
	        return Integer.MAX_VALUE;
	 
	      // Store the maximum vakue.
	      int root = harr[0];
	 
	      // If there are more than 1 items, move the last item to root
	      // and call heapify.
	      if (heap_size > 1)
	      {
	        harr[0] = harr[heap_size - 1];
	        minHeapify(0);
	      }
	      heap_size--;
	      return root;
	    }
	    
	    void minHeapify(int i)
	    {
	      int l = left(i);
	      int r = right(i);
	      int smallest = i;
	      if (l < heap_size && harr[l] < harr[i])
	        smallest = l;
	      if (r < heap_size && harr[r] < harr[smallest])
	        smallest = r;
	      if (smallest != i)
	      {
	        int t = harr[i];
	        harr[i] = harr[smallest];
	        harr[smallest] = t;
	        minHeapify(smallest);
	      }
	    }
	  }
public static void main(String agrs[]){
	Scanner s = new Scanner(System.in);
	// System.out.println("Enter a list of 10 integers");

	// Creating and filling a list with Random Integers
	int[] list = new int[10];
	Random rand = new Random();
	int upperbound = 999;
	for (int i = 0; i < 8; i++) {
		list[i] = rand.nextInt(upperbound);
	}
	list[8] = 999;
	list[9] = 999;

	// Printing out the list for the user
	System.out.print("List: ");
	for (int i : list)
		System.out.print("\t" + i);

	// Taking User Input for k
	System.out.println(" \nEnter the kth smallest element you want for find from the list");
	int k = s.nextInt();

	/*
	 * // Creating a new list with unique elements ArrayList<Integer> arr = new
	 * ArrayList<Integer>(list.length); arr.add(list[0]); for (int i = 1; i <
	 * list.length; i++) { if (!arr.contains(list[i])) { arr.add(list[i]); } }
	 */

	 Arrays.sort(list);
	    System.out.print("Sorted List: ");
		for(int val: list)
			System.out.print("\t" + val);
		
	KthMinElement gfg = new KthMinElement();
    System.out.print("\n" +k+ "'th smallest element is " + gfg.kthSmallest(list, list.length, k));
    
    s.close();
}

int kthSmallest(int arr[], int n, int k)
{

  // Build a heap of first k elements: O(k) time
  MinHeap mh = new MinHeap(arr, n);

  // Process remaining n-k elements. If current element is
  // smaller than root, replace root with current element
  for (int i = 0; i < k - 1; i++)
    mh.extractMin();

  // Return root
  return mh.getMin();
}
}
