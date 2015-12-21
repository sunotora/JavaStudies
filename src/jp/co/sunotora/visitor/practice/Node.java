package jp.co.sunotora.visitor.practice;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

	List<Node> nodeList = new ArrayList<Node>();
	String name = "";
	int size = 0;

	abstract public void add(Node node);

	abstract public String accept(Visitor visitor);
	abstract public String accept(Visitor visitor, String dir);

	public Node(String name) {
		this.name = name;
	};

	public Node(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	};

	public List<Node> getNodeList() {
		return nodeList;
	}


}
