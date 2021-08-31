package aspClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
public static void main(String agrs[]) {	
	IterativeFibo(10000);
}

public static int Fibo(int val) {
	int result = 0;
	if(val == 0) {
		return 0;
	} else if(val == 1) {
		return 1;
	}else {
return result= Fibo(val-1) + Fibo(val-2);
	}
}

public static void IterativeFibo(int val) {
	List<Integer> result = new ArrayList<Integer>();
	result.add(0);
	result.add(1);
	
	for(int i=2; i<=val; i++) {
	 result.add(result.get(i-1)+ result.get(i-2));	
		}
	
	System.out.println(result);
	}
	
}
