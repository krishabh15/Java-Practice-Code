package sorting;

public class MergeSort {
	public static void mergesort(int[] array) {
		mergesort(array, new int [array.length], 0, array.length-1);
	}
	
	public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
		if(leftStart >= rightEnd) {
			return;
		}
		
		int middle = (leftStart + rightEnd)/2;
		mergesort(array, temp, leftStart, middle);
		mergesort(array, temp, middle+1, rightEnd);
		mergeHalves(array, temp, leftStart, rightEnd);
		// System.out.println(array[0]);
		// System.out.println(temp[5]);
		
	}
	
	public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftStart && right <= rightEnd){
			if(array[left] <= array[right]) {
				temp[index] = array[left];
				left++;
			} else {
				temp[index] = array[right];
				right++;
			}
			
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd-left+1);
		System.arraycopy(array, left, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}
	
public static void main(String agrs[]) {
	int[] arr = {53,78, 98, 26, 19, 108, 74, 33, 89, 9, 3, 111, 1};
	mergesort(arr);
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
