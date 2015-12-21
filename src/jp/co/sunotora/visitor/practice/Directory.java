package jp.co.sunotora.visitor.practice;

public class Directory extends Node {

	public Directory(String name) {
		super(name);
	}

	public Directory(String name, int size) {
		super(name, size);
	}

	@Override
	public void add(Node node) {
		this.nodeList.add(node);
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitor(this, "");
	}


	@Override
	public String accept(Visitor visitor, String dir) {
		return visitor.visitor(this, dir);
	}
}
