package aspClass;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Node {
	Object data;
	Node next;

	Node() {
	}

	Node(int d) {
		this.data = d;
	}

	Node(String s) {
		this.data = s;
	}
}


class IntegerQueue{
	 static Node head = new Node();
	 static Node tail = new Node();
	 static int counter = 0;
	IntegerQueue() {
		System.out.println("Queue of type Integer initialized");
		this.head = null;
		this.tail = null;
		this.counter = 0;
	}

	
	public static void push(int value) {
		/*
		 * if (counter >= size) { System.out.println("Can insert " + element +
		 * ", the queue is Full."); return; } else {
		 */
		// int val = value;
		Node n = new Node(value);
		n.next = null;
		if (tail == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}

		counter++;
		// }
	}

	public static void pop() {
		Object popped = 0;
		if (head == null && tail == null) {
			System.out.println("Queue is empty");
			new IntegerQueue();
		} else {
			popped = head.data;
			head = head.next;
			counter--;

			System.out.println("Popped Element " + popped + ".");
		}
	}

	public static void count() {
		System.out.println(counter);
	}

}

class StringQueue {
	static Node head = new Node();
	static Node tail = new Node();
	static int counter = 0;
	
	StringQueue() {
		System.out.println("Queue of type String initialized");
		this.head = null;
		this.tail = null;
		this.counter = 0;
		
		
	}
	
	public static void push(String value) {
		/*
		 * if (counter >= size) { System.out.println("Can insert " + element +
		 * ", the queue is Full."); return; } else {
		 */
		String val = value;
		Node n = new Node(val);
		n.next = null;
		if (head == null && tail == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}

		counter++;
		// }
	}

	public static void pop() {
		Object popped = 0;
		if (head == null && tail == null) {
			System.out.println("Queue is empty");
			new StringQueue();
		} else {
			popped = head.data;
			head = head.next;
			counter--;

			System.out.println("Popped Element " + popped + ".");
		}
	}

	public static void count() {
		System.out.println(counter);
	}
	
}

public class AbstractQueue {
	public static void main(String agrs[]) {
		Scanner typeScan = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the type of queue you want to initialize: Integer or String");
		String type = typeScan.nextLine();
		Scanner input = new Scanner(System.in);
		if(type.equals("String")) {
			StringQueue q = new StringQueue();
			String opt = "abc";
			
				while (!"End".equals(opt)) {
					printOptions();
					opt = chooseOptions();
					switch (opt) {
					case "Push":
						System.out.println("Enter " +type+ " value to be pushed");
							String value = input.nextLine();
							q.push(value);
						break;
					case "Pop":
						q.pop();
						break;
					case "Count":
						q.count();
						break;
					case "End":
						System.out.println("End of program");
						return;
					default:
						System.out.println("Not a valid option");
					}
				}
		} else {
			IntegerQueue q = new IntegerQueue();
			String opt = "abc";
			
				while (!"End".equals(opt)) {
					printOptions();
					opt = chooseOptions();
					switch (opt) {
					case "Push":
						System.out.println("Enter " +type+ " value to be pushed");
							int value = input.nextInt();
							q.push(value);
						break;
					case "Pop":
						q.pop();
						break;
					case "Count":
						q.count();
						break;
					case "End":
						System.out.println("End of program");
						return;
					default:
						System.out.println("Not a valid option");
					}
				}
		}
		

		input.close();
		s.close();
		typeScan.close();
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
