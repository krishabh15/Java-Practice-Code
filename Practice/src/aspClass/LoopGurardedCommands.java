package aspClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LoopGurardedCommands {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 integers as input (the first 2 should be different)");
		// Taking the input from the user
		int a = s.nextInt();
		int b = s.nextInt();
		// Checking if the values input by the are distinct, if no the code terminates
		// with an error message
		if (a == b) {
			System.out.println("Input Error");
			s.close();
			return;
		}
		int c = s.nextInt();
		// Checking for the correct range
		int big, small;
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}

		// Putting the values of all the true if() cases in a list
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = small; i <= big; i++) {
			if (c % i == 0) {
				list.add(i);
			}
		}

		System.out.println(list);
		if(list.size() == 0) {
			System.out.println("No Solution for the given numbers");
			s.close();
			return;
		}
		// Fibonacci Test Cases
		/*
		 * System.out.println(FinbonacciSeries(89));
		 * System.out.println(FinbonacciSeries(100));
		 * System.out.println(FinbonacciSeries(173));
		 * System.out.println(FinbonacciSeries(500));
		 * System.out.println(FinbonacciSeries(1000));
		 */

		// Printing out the Fibo Series using a random function from the found out true
		// cases

		Random rand = new Random();
		int upperbound = list.size();
		int int_random = rand.nextInt(upperbound);
		System.out.println("Random Integer: " + int_random);
		System.out.println("Element from the list picked: " + list.get(int_random));
		System.out.println(FinbonacciSeries(list.get(int_random)));
		s.close();
	}

	public static List<Integer> FinbonacciSeries(int value) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(0);
		result.add(1);
		int i = 2;
		while ((result.get(i - 1) + result.get(i - 2)) < value) {
			result.add(result.get(i - 1) + result.get(i - 2));
			i++;
		}
		return result;
	}
}
