package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChangeProblem {
	public static void main(String args[]) {
		int[] array = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int notecount = 0;
		ArrayList<Integer> currency = new ArrayList<Integer>();
		System.out.println("Enter amount: ");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int key = N;
		for (int i = array.length - 1; i >= 0; i--) {
			while (N > 0 && N >= array[i]) {
				N = N - array[i];
				currency.add(array[i]);
				notecount++;
			}
		}

		System.out.println(notecount);
		System.out.println(currency);
		ArrayList<Integer> coins = new ArrayList<Integer>();
		for (int k = 0; k < currency.size(); k++) {
			if (coins.contains(currency.get(k))) {
			} else {
				coins.add(currency.get(k));
			}
		}
		System.out.println(coins);

		int sum = 0;
		for (int val : currency) {
			sum = sum + val;
		}

		if (key == sum) {
			System.out.println("Yayy!");
		} else {
			System.out.println("Oh No!");
		}
		System.out.println("Sum of the Total currency in the currency list: " + sum);

		s.close();
	}
}
