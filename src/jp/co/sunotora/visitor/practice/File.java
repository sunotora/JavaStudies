package jp.co.sunotora.visitor.practice;

public class File extends Node {

	public File(String name) {
		super(name);
	}

	public File(String name, int size) {
		super(name, size);
	}

	@Override
	public void add(Node node) {
		throw new NullPointerException(); //暫定
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
