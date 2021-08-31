package sorting;

public class InsertionSort {
	public static void main(String agrs[]) {
		int[] arr = { 5, 6, 7, 8, 8, 8, 8, 4, 757, 53, 457, 58, 554, 7434, 88, 9, 334 };
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j-1]) {
				swap(arr, j, j-1);
				// int temp = arr[i];
				// arr[i] = arr[j];
				// arr[j] = temp;
				j--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}