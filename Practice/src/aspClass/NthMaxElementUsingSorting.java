package aspClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class NthMaxElementUsingSorting {
	public static void main(String ars[]) {
		Scanner s = new Scanner(System.in);
		// System.out.println("Enter a list of 10 integers");

		// Creating and filling a list with Random Integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		int upperbound = 999;
		for (int i = 0; i < 8; i++) {
			list.add(rand.nextInt(upperbound));
		}
		list.add(999);
		list.add(999);

		// Printing out the list for the user
		System.out.print("List: ");
		for (int i : list)
			System.out.print("\t" + i);

		// Taking User Input for k
		System.out.println(" \n Enter the kth maximum element you want for find from the list");
		int k = s.nextInt();

		// Creating a new list with unique elements
		ArrayList<Integer> arr = new ArrayList<Integer>(list.size());
		arr.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (!arr.contains(list.get(i))) {
				arr.add(list.get(i));
			}
		}

		// Printing out the output
		System.out.println(k + "th max element in the list is: " + kthMax(arr, k));
		System.out.print("Sorted List: ");
		for (int i : arr)
			System.out.print("\t" + i);

		s.close();
	}

// Method for finding the kthMax Element
	public static int kthMax(ArrayList<Integer> arr, int k) {
		Collections.sort(arr);
		return arr.get(arr.size() - k);
	}

}
