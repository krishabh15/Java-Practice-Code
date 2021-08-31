package aspClass;

import java.util.Random;

public class QuickSort {
public static void main(String agrs[]) {
	int[] list = new int[5];
	Random rand = new Random();
	int upperbound = list.length;
	for(int i=0; i<list.length-1;i++) {
		list[i]= rand.nextInt(upperbound);
		}
	
	for(int i: list) {
		System.out.println(i);
	}
	
	quickSort(list, 0, list.length-1);
	
	for(int i: list) {
		System.out.println(i);
	}
	
}

public static void quickSort(int[] array, int low, int high) {
	int[] inp_list = array;
	int l = low; 
	int h = high;
	int j;
	if(l<h) {
		 j = partition(inp_list,l,h);
		quickSort(inp_list,l,j);
		quickSort(inp_list,j+1,h);
		}
}
	
	public static int partition(int[] array, int l, int h) {
		int[] list = array;
		int i = l;
		int j = h;
		Random rand = new Random();
		int pivot = rand.nextInt(h-l)+ l;
		
		while(i<j) {
			while(list[i] <= pivot) {
				i++;
			}
			while(list[j] > pivot) {
				j--;
			}
			swap(list[i], list[j]);
		}
		
		swap(list[l], list[j]);
		return j;
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
}
