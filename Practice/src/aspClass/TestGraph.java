package aspClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Edge {
	int weight;
	Node source;
	Node destination;

	public Edge(Node src, Node des, int weight) {
		this.source = src;
		this.destination = des;
		this.weight = weight;
	}

}

class Graph {
	Map<Integer, Node> nodes;
	Map<String, Edge> edges;

	Graph() {
		this.edges = new HashMap<String, Edge>();
		this.nodes = new HashMap<Integer, Node>();
	}

	public boolean setNode(int data) {
		if (this.nodes.containsKey(data)) {
			return false;
		}
		nodes.put(data, new Node(data));
		return true;
	}

	public boolean connect(int src, int des, int weight) {
		if (this.edges.containsKey(src) || this.edges.containsKey(des)) {
			return false;
		}

		String id = "e" + src + "" + des;

		if (edges.containsKey(id)) {
			return false;
		} else {
			this.edges.put(id, new Edge(this.nodes.get(src), nodes.get(des), weight));
		}
		return true;
	}

	public void printInfo() {
		System.out.println("Edge\tSrc\tDes\tWeight");
		for(String id: this.edges.keySet()) {
			Edge e = this.edges.get(id);
			System.out.println(id + "\t" + e.source.data + "\t" +e.destination.data + "\t" + e.weight);
		}
	}
	
}

public class TestGraph {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		Graph g = new Graph();
		for(int i=1; i<=10; i++) {
			g.setNode(i);	
		}
		for(int k =0; k<5; k++) {
			for( int j=10; j>=5; j--) {
				g.connect(k,j, k+j);
			}
		}
		g.printInfo();
		s.close();
	}
}
