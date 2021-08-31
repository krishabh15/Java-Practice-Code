package tree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxHeap {
	public static void main(String agrs[]) {
		System.out.println("Input the required size of the array: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] array = new int[size];
		Random r = new Random();
		int ub = 1000;
		for (int i = 0; i < size; i++) {
			array[i] = r.nextInt(ub);
		}
		Arrays.sort(array);
		for (int value : array) {
			System.out.println(value);
		}
		int[] maxheap = reverse(array);
		for (int heapvals : maxheap) {
			System.out.println(heapvals);
		}
//node{}
		// java.util.Collections.sort(array); // This doesn't work as it for lists.

		s.close();
	}

	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			result[i] = array[array.length - 1 - i];
		}
		return result;
	}
	
	public static void insert(int n, int[] heap){
		
		// This will give me an error for now since the array is initialized to size by adding the element, the size overflow.
		// Add an overflow check
		
		
		heap[heap.length] = n; // Add element to the leaf
		// Put in the right place
		int start = heap.length;
		for(int i=heap.length; i>=0; i++) {
			while(heap[start] > heap[start/2]) {
				swap(heap, start, start/2);
				start = start/2;
			}
		}
	}
	
	public static void delete() {
		
	}
	
	public static int[] swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}
}
