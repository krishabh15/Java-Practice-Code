package leetCode.recursion;

import java.util.ArrayList;

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {}
	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public static void swapPairs(ListNode head) {
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		
		ListNode node1;
		ListNode node2;
		
		node1 = head;
		node2 = node1.next;
		while(node2.next != null) {
		swap(node1, node2);
		
		node1 = node2.next;
		node2 = node1.next;
		}
		
		ListNode node;
		result.add(head.val);
		node = head;
		while(node.next != null) {
		result.add(node.next.val);
		node = node.next;
		}
		
		System.out.println(result);
	}
	
	public static void swap(ListNode n1, ListNode n2) {
		int temp = n1.val;
		n1.val = n2.val;
		n2.val = temp;
		
		ListNode temp_pointer = n1.next;
		n1.next = n2.next;
		n2.next = temp_pointer;
	}
	
	public static void swapList(ListNode node){
		
		ListNode head = node;
		
		head.val = head.next.val;
		head = head.next;
		
	}
}


public class SwapNodeInPairs {
	public static void main(String args[]) {
		
	}
}
