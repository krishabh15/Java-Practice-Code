package aspClass;

import java.util.Scanner;

class IntNode{
	Object data;
	IntNode next;
	public IntNode(int d){
		this.data = d;
	}
}

public class IntQueue {
	static IntNode head = null;
	static IntNode tail = null;
	static int counter = 0;
	
	public IntQueue(){
		this.head  = null;
		this.tail = null;
		counter = 0;
	}
public static void main(String agrs[]){
	Scanner s = new Scanner(System.in);
	String opt = "abc";
		while (!"End".equals(opt)) {
			printOptions();
			opt = chooseOptions();
			switch (opt) {
			case "Push":
				System.out.println("Enter value to be pushed");
					int value = s.nextInt();
					push(value);
				break;
			case "Pop":
			pop();
				break;
			case "Count":
			count();
				break;
			case "End":
				System.out.println("End of program");
				return;
			default:
				System.out.println("Not a valid option");
			}
		}
		
		s.close();
}

public static void push(int element) {
	IntNode n = new IntNode(element);
	n.next = null;
	if (tail == null) {
		head = n;
		tail = n;
	} else {
		tail.next = n;
		tail = n;
	}

	counter++;
}

public static void pop() {
	int popped = 0;
	if (head == null) {
		System.out.println("Queue is empty");
		new IntQueue();
		
	} else {
		popped = (int) head.data;
		head = head.next;
		counter--;

		System.out.println("Popped Element " + popped + ".");
	}
}

public static void count() {
	System.out.println(counter);
}
public static void printOptions() {
	System.out.println("Enter the operation you want to perform: ");
	System.out.println("1. Push");
	System.out.println("2. Pop");
	System.out.println("3. Count");
	System.out.println("4. End");

}

public static String chooseOptions() {
	Scanner s = new Scanner(System.in);
	String option = s.nextLine();
	return option;
}

}
