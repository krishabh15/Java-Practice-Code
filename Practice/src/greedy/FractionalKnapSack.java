package greedy;

public class FractionalKnapSack {
public static void main(String args[]){
	
}

struct(){
	
}


 double FractionalKnapsack(int w, struct item arr[], int n){
	
	sort(arr, arr+n, cmp);
	int curweight = 0;
	double finalvalue= 0.0;
	
	for(int i=0; i<n; i++) {
		if(curweight + arr[i] <= w ) {
			curwight += arr[i].weight;
			finalvalue += arr[i].value; 
		} else {
			int remain = w-curweight;
			finalvalue += arr[i].value - ((double) remain/ arr[i].weight);
			break;
		}
		
		
	}
	return finalvalue;
}
}
