package sorting;

public class BubbleSort {
public  static void main(String agrs[]){
	int[] arr = { 5, 6, 7, 8, 8, 8, 8, 4, 757, 53, 457, 58, 554, 7434, 88, 9, 334 };
	
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1] < arr[j]) {
					swap(arr, j+1, j);
				}
			}
		}
		
		
	
	for (int k = 0; k < arr.length; k++) {
		System.out.println(arr[k]);
	}
}
public static void swap(int[] array, int i, int j) {
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}
}
