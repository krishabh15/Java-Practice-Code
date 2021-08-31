package aspClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPrimes {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range");
		System.out.println("low: ");
		int low = s.nextInt();
		System.out.println("high: ");
		int high = s.nextInt();

		if (low > high) {
			int temp = high;
			high = low;
			low = temp;
		}

		System.out.println("Primes between the range " + low + " to " + high);
		List<Integer> result = Primes(low,high);
		for(int val: result) {
			System.out.println(val + " is a Prime Number");
		}
		// System.out.println(Primes(low, high));
		s.close();
	}

	public static List<Integer> Primes(int low, int high) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = low; i <= high; i++) {
			int flag = 0;
			if(i<=1) {flag = 1;}
			/*
			 * if(i==2) { list.add(i); }
			 */
			for (int j = 2; j <=Math.sqrt(i); j++) {
				if(i%j == 0) {
					flag = 1;
					break;
				} 
			} 
			
			if(flag==0) {
				list.add(i);
			}

		}
		return list;
	}
}