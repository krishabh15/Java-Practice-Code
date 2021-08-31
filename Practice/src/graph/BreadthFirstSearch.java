package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Graph{
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) {
			this.id = id;
		}
	}

private Node getNode(int id) {	}
public void addEdge(int source, int destination) { }

public boolean hasPathDFS(int source, int destination) {
	Node s = getNode(source);
	Node d = getNode(destination);
	HashSet<Integer> visited = new HashSet<Integer>(); 
	return hasPathDFS(s,d, visited);
}

private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
	if(visited.contains(source.id)) {
		return false;
	}
	visited.add(source.id);
	if(source == destination) {
		return true;
		}
	
	for(Node child: source.adjacent) {
		if(hasPathDFS(child, destination, visited)) {
			return true;
		}
	}
	
	return false;
} 

public boolean hasBFS() {
	
}

}



public class BreadthFirstSearch {

}
