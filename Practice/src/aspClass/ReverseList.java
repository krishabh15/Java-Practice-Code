package aspClass;

import java.util.Scanner;

public class ReverseList {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string/expression to reverse: ");
		String input = s.nextLine();
		reverse(input);
		s.close();
	}

	public static void reverse(String word) {
		char[] input_to_array = word.toCharArray();
		char[] result_array = new char[input_to_array.length];
		for (int i = 0; i < input_to_array.length; i++) {
			if (input_to_array[input_to_array.length - 1 - i] == '(') {
				result_array[i] = ')';
			} else if (input_to_array[input_to_array.length - 1 - i] == ')') {
				result_array[i] = '(';
			} else {

				result_array[i] = input_to_array[input_to_array.length - 1 - i];
			}

		}

		System.out.println(String.valueOf(result_array));
	}
}